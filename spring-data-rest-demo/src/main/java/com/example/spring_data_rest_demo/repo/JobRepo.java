package com.example.spring_data_rest_demo.repo;

import com.example.spring_data_rest_demo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> searchByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}
