package com.irlix.interview.task.shop.springshop.mapper;

import org.mapstruct.Mapper;

import com.irlix.interview.task.shop.springshop.dto.CategoryDto;
import com.irlix.interview.task.shop.springshop.model.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
	CategoryDto toDto(Category category);

	Category toEntity(CategoryDto categoryDto);
}
