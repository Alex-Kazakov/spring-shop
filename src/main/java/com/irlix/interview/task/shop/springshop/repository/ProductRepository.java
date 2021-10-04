package com.irlix.interview.task.shop.springshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irlix.interview.task.shop.springshop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
