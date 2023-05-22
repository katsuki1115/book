package com.example.demo.dao;

import java.util.List;

import com.example.demo.common.DateNotFoundException;
public interface BaseDao<T> {
	public List<T> findAll();
	public T findById(Integer id) throws DateNotFoundException;
	public void save(T t);
	public void delete(Integer id);
}
