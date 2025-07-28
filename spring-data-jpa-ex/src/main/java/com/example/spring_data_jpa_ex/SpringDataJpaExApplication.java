package com.example.spring_data_jpa_ex;

import com.example.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringDataJpaExApplication.class, args);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		StudentRepo repo = context.getBean(StudentRepo.class);

		s1.setRollNo(1);
		s1.setName("Ritwik");
		s1.setMarks(101);

		s2.setRollNo(2);
		s2.setName("Barry");
		s2.setMarks(90);

		s3.setRollNo(3);
		s3.setName("Larry");
		s3.setMarks(80);

//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());

//		Optional<Student> s = repo.findById(3);
//
//		System.out.println(s.orElse(new Student()));


//		System.out.println(repo.findByName("Ritwik"));
//		System.out.println(repo.findByMarks(100));
//		System.out.println(repo.findByMarksGreaterThan(90));

//		repo.save(s1);
		repo.delete(s3);

	}

}
