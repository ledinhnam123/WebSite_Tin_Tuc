package com.laptrinhjavaweb.DAO;

import java.util.List;

import com.laptrinhjavaweb.model.NewModel;

public interface INewDAO {

	List<NewModel> findByCategoryId(Long categoryId);
	
}
