package com.irlix.interview.task.shop.springshop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
	private String login;
	private String password;
	private String firstName;
	private String lastName;
}
