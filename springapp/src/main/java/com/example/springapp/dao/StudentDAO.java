package com.example.springapp.dao;

@Repository
public class StudentDAO {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> get() {
		return studentRepository.findAll();
	}

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}
}