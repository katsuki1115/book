package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.common.DateNotFoundException;
import com.example.demo.entity.Author;
import com.example.demo.repository.AuthorRepository;

@Repository
public class AuthorDao implements BaseDao<Author>{

	@Autowired
	AuthorRepository repository;

	@Override
	public List<Author> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findAll();
	}

	@Override
	public Author findById(Integer id) throws DateNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findById(id).orElseThrow(() -> new DateNotFoundException());
	}

	@Override
	public void save(Author author) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(author);
	}

	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Author author = this.findById(id);
			repository.delete(author);
		} catch (DateNotFoundException e) {
			System.out.println("do nothing");
		}
	}
	
}
