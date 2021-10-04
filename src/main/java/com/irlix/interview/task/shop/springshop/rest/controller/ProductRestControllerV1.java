package com.irlix.interview.task.shop.springshop.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irlix.interview.task.shop.springshop.dto.ProductDto;
import com.irlix.interview.task.shop.springshop.mapper.ProductMapper;
import com.irlix.interview.task.shop.springshop.model.Product;
import com.irlix.interview.task.shop.springshop.repository.ProductRepository;

@RestController
@RequestMapping("/api/v1/products")
public class ProductRestControllerV1 {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductMapper productMapper;

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createProduct(@RequestBody ProductDto productDto) {
		productRepository.save(productMapper.toEntity(productDto));
	}

	@GetMapping("/{id}")
	public Product findProductById(@PathVariable Long id) {
		return productRepository.findById(id).orElse(null);
	}
}
