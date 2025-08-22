package com.example.Spring_boot_rest.repo;

import com.example.Spring_boot_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findUserByUsername(String username);

}
