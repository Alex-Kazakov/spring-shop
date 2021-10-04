package com.irlix.interview.task.shop.springshop.mapper;

import org.mapstruct.Mapper;

import com.irlix.interview.task.shop.springshop.dto.UserDto;
import com.irlix.interview.task.shop.springshop.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	UserDto toDto(User user);

	User toEntity(UserDto userDto);

}
