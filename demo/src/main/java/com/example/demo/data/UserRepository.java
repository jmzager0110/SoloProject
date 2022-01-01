package com.example.demo.data;

import com.example.demo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findByUsername(String displayName);

    Optional<User> findById(Integer userId);
}
