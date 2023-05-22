package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.DateNotFoundException;
import com.example.demo.dao.BaseDao;
import com.example.demo.entity.Category;

@Service
public class CategoryService implements BaseService<Category> {
	@Autowired
	private BaseDao<Category> categoryDao;
	
	@Override
	public List<Category> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return categoryDao.findAll();
	}

	@Override
	public Category findById(Integer id) throws DateNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return categoryDao.findById(id);
	}

	@Override
	public void save(Category category) {
		// TODO 自動生成されたメソッド・スタブ
		categoryDao.save(category);
	}

	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		categoryDao.delete(id);
	}
	
}
