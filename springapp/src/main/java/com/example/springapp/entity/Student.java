package com.example.springapp.entity;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1681261145191719508L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;

	// Generate Getters and Setters...
}