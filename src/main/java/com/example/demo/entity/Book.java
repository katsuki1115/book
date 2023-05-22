package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "タイトルが未入力です")
	@Size(max = 255, message = "タイトルは255字以内で入力してください")
	private String price;
	
	@NotNull(message = "著者が未入力です")
	@ManyToOne
	private Author author;
	
	@NotNull(message = "カテゴリが未入力です")
	@OneToMany(mappedBy = "author")
	private Category category;
}
