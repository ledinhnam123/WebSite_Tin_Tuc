package com.laptrinhjavaweb.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.laptrinhjavaweb.DAO.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO  {

	
	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		 return query(sql,new NewMapper() ,categoryId);
	
	}

	@Override
	public Long save(NewModel newModel) {
		String sql = "Insert INTO news(title, content, categoryid) VALUES(?,?, ?)";
		return insert(sql,newModel.getTitle(),newModel.getContent(),newModel.getCategoryId());
	}

	
	
	

}
