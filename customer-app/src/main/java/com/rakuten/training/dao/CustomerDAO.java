package com.rakuten.training.dao;


import java.util.List;

import com.rakuten.training.domain.Customers;

public interface CustomerDAO {
	
	public Customers save(Customers toBeSaved);
	public Customers findById(int id);
	public Customers findByFirstName(String firstName);
	public List<Customers> findAll();
	public void deleteById(int id);

}