package com.tyss.ps.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class FilterDTO {

	@Size(min = 3, max = 30, message = "the name of the product should contain min 3 chars and max 30 chars")
	private String name;

	@Positive(message = "price should a +ve number")
	private Double price;

	@NotNull(message = "color cannot be empty")
	private String color;

}
