package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.common.DateNotFoundException;
import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
@Repository
public class CategoryDao implements BaseDao<Category>{

	@Autowired
	CategoryRepository repository;

	@Override
	public List<Category> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findAll();
	}

	@Override
	public Category findById(Integer id) throws DateNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findById(id).orElseThrow(() -> new DateNotFoundException());
	}

	@Override
	public void save(Category category) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(category);
	}

	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Category category = this.findById(id);
			repository.delete(category);
		} catch (DateNotFoundException e) {
			System.out.println("do nothing");
		}
	}

}
