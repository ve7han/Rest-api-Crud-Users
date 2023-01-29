package com.doIt.restful_app.repository;

import com.doIt.restful_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
