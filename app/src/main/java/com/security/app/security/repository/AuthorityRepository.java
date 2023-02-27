package com.security.app.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.security.app.security.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    
}
