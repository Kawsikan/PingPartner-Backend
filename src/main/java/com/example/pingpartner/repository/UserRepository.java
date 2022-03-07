package com.example.pingpartner.repository;

import com.example.pingpartner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
