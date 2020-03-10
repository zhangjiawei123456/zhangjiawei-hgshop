package com.zhangjiawei.hgshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zhangjiawei.hgshop.pojo.Brand;



public interface BrandDao {

	/***
	 * 获取所有的品牌
	 * @return
	 */
	@Select("SELECT id,name,first_char as firstChar "
			+ " FROM hg_brand "
			+ "where deleted_flag=0"
			+ " ORDER BY name ")
	List<Brand> listAll();

}
