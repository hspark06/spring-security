package com.security.app.security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.security.app.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByUsername(String username);
}