package com.example.spring_data_jpa_ex;

import com.example.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    // it will work with the query as some of the use cases are provided by JPA but for complex things query should be provided
//    @Query("select s from Student s where s.name=?1")
//    List<Student> findByName(String name);

    List<Student> findByName(String name);

//    @Query("select s from Student s where s.marks=?1")
    List<Student> findByMarks(int marks);
@Query("select s from Student s where s.marks > ?1")
    List<Student> findByMarksGreaterThan(int marks);
}
