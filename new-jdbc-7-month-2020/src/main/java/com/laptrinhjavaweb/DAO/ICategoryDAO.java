package com.laptrinhjavaweb.DAO;

import java.util.List;

import com.laptrinhjavaweb.model.CategoryModel;

public interface ICategoryDAO {

	List<CategoryModel> findAll();
}
