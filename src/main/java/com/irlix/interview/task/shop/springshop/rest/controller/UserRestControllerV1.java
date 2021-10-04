package com.irlix.interview.task.shop.springshop.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irlix.interview.task.shop.springshop.dto.UserDto;
import com.irlix.interview.task.shop.springshop.mapper.UserMapper;
import com.irlix.interview.task.shop.springshop.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestControllerV1 {

	@Autowired
	UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

//	@PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public void register(@RequestBody UserDto userDto) {
//		System.out.println(userDto);
//		User user = new User();
//		user.setFirstName(userDto.getFirstName());
//		user.setLastName(userDto.getLastName());
//		user.setLogin(userDto.getLogin());
//		user.setPassword(userDto.getPassword());
//		userRepository.save(user);
//	}

	@PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void register(@RequestBody UserDto userDto) {
		userRepository.save(userMapper.toEntity(userDto));
	}
}
