package org.websparrow.controller;

@RestController(value = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public ResponseEntity<Response> get() {
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(studentService.get(), new Date()));
	}

	@PostMapping
	public ResponseEntity<Response> save(@RequestBody Student student) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(studentService.save(student), new Date()));
	}

	@PutMapping
	public ResponseEntity<Response> update(@RequestBody Student student) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(studentService.save(student), new Date()));
	}

	@DeleteMapping
	public ResponseEntity<Response> delete(@RequestParam("id") int id) {
		studentService.delete(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new Response(true, new Date()));
	}
}