package com.zhangjiawei.hgshop.dao;

import java.util.List;

import com.zhangjiawei.hgshop.pojo.Category;

/***
 * 
 * @author 26723
 *
 */
public interface CategoryDao {

	 List<Category> tree();

	int add(Category category);

	/**
	 * 
	 * @param id
	 * @return
	 */
	int delete(Integer id);

	/**
	 * ÐÞ¸Ä
	 * @param category
	 * @return
	 */
	int update(Category category);
}
