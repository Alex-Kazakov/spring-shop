package com.irlix.interview.task.shop.springshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irlix.interview.task.shop.springshop.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
