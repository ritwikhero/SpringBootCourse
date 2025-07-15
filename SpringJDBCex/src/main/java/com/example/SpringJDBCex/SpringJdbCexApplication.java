package com.example.SpringJDBCex;

import com.example.SpringJDBCex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbCexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCexApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(1);
		s.setName("Greatest");
		s.setMarks(100);

		addStudent(s);

	}

}
