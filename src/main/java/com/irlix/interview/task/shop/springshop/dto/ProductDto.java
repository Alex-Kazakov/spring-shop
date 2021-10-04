package com.irlix.interview.task.shop.springshop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {

	private String name;
	private Double price;
	private Integer quantity;
}
