package com.irlix.interview.task.shop.springshop.mapper;

import org.mapstruct.Mapper;

import com.irlix.interview.task.shop.springshop.dto.ProductDto;
import com.irlix.interview.task.shop.springshop.model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	ProductDto toDto(Product product);

	Product toEntity(ProductDto productDto);
}
