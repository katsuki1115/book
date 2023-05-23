package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.DataNotFoundException;
import com.example.demo.dao.BaseDao;
import com.example.demo.entity.Author;

@Service
public class AuthorService implements BaseService<Author> {
	@Autowired 
	private BaseDao<Author> authorDao;

	@Override
	public List<Author> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return authorDao.findAll();
	}

	@Override
	public Author findById(Integer id) throws DataNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return authorDao.findById(id);
	}

	@Override
	public void save(Author author) {
		// TODO 自動生成されたメソッド・スタブ
		authorDao.save(author);
	}

	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		authorDao.delete(id);
	}
	
	
	
}
