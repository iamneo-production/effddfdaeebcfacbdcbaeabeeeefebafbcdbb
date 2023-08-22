package com.example.springapp.service;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public List<Student> get() {
		return studentDAO.get();
	}

	public Student save(Student student) {
		return studentDAO.save(student);
	}

	public void delete(int id) {
		studentDAO.delete(id);
	}
}