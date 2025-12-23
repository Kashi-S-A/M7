package com.tyss.ps.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "products")
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;

	@Size(min = 3, message = "the name of the product should contain min 3 chars and max 30 chars")
	private String name;

	@Positive(message = "price should a +ve number")
	private Double price;

	private String description;

	@NotNull(message = "color cannot be empty")
	private String color;
	
	@CreationTimestamp
	private LocalDate createdDate;

	@UpdateTimestamp
	private LocalDate lastUpdatedDate;

}
