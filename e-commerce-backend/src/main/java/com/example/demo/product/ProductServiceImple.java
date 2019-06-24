package com.example.demo.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImple implements ProductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Product save(Product entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);;
	}

	@Override
	public Product update(Product entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return repo.count();
	}

}
