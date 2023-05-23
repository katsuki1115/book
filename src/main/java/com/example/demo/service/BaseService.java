package com.example.demo.service;

import java.util.List;

import com.example.demo.common.DateNotFoundException;

public interface BaseService<T> {
	public List<T> findAll();

	public T findById(Integer id) throws DateNotFoundException;

	public void save(T t);

	public void delete(Integer id);
}
