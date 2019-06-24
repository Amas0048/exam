package com.example.demo.product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {
	
	public List<Product> findAll();
	
	public Product findById(Long id);
	
	public Product save(Product entity);
	
	public void delete(Long id);
	
	public Product update(Product entity);
	
	public Long count();

}
