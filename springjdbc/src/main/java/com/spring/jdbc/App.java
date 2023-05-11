package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		/*
		 * JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		 * 
		 * // Insert Query
		 * 
		 * String query = "insert into student(id, name, city) values(?, ?, ?)";
		 * 
		 * // Fire the query
		 * 
		 * int result = template.update(query, 123, "Sanskar", "Nagpur");
		 * System.out.println("number of record inserted" + result);
		 * 
		 */

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
//		Insert
		student.setId(666);
		student.setName("Utkarsh");
		student.setCity("Amarawati");
//
		int result = studentDao.insert(student);
		System.out.println("Student added " + result);

//		update
//		student.setId(666);
//		student.setName("Sanidhya");
//		student.setCity("Indore");
//
//		int result = studentDao.change(student);
//		System.out.println("Data changed " + result);

//		Delete data
//		int result = studentDao.remove(666);
//		System.out.println("Deleted " + result);

//		Student student = studentDao.getStudent(222);
//		System.out.println(student);

		List<Student> students = studentDao.getAllStudents();

		for (Student s : students) {
			System.out.println(s);
		}

	}
}
