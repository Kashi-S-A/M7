package com.tyss.ps.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

	private String name;

	private Double price;

	private String description;

	private String color;
	
	@CreationTimestamp
	private LocalDate createdDate;

	@UpdateTimestamp
	private LocalDate lastUpdatedDate;

}
