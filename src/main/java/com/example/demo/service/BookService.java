package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.DataNotFoundException;
import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@Service
public class BookService implements BaseService<Book> {

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return bookDao.findAll();
	}

	@Override
	public Book findById(Integer id) throws DataNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return bookDao.findById(id);
	}
	
	public List<Book> findByauthorId(Integer authorId) throws DataNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return bookDao.findByAuthorId(authorId);
	}
	
	public List<Book> findByCategoryId(Integer categoryId) throws DataNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		return bookDao.findByCategoryId(categoryId);
	}

	@Override
	public void save(Book book) {
		// TODO 自動生成されたメソッド・スタブ
		bookDao.save(book);
	}

	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		bookDao.delete(id);
	}

}
