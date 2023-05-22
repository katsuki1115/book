package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.common.DateNotFoundException;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Repository
public class BookDao implements BaseDao<Book>{

	@Autowired
	BookRepository repository;

	@Override
	public List<Book> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findAll();
	}

	@Override
	public Book findById(Integer id) throws DateNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return repository.findById(id).orElseThrow(() -> new DateNotFoundException());
	}

	@Override
	public void save(Book book) {
		// TODO 自動生成されたメソッド・スタブ
		repository.save(book);
	}

	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Book book = this.findById(id);
			repository.delete(book);
		} catch (DateNotFoundException e) {
			System.out.println("do nothing");
		}
	}
	
	public List<Book> findByAuthorId(Integer authorId){
		return repository.findByAuthorId(authorId);
	}
	
	public List<Book> findByCategoryId(Integer categoryId){
		return repository.findByCategoryId(categoryId);
	}

}
