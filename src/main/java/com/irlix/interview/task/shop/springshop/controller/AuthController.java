package com.irlix.interview.task.shop.springshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	@GetMapping(value = "/login")
	public void login() {

	}

}
