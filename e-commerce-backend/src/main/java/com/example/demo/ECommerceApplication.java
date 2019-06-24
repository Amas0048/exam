package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.product.Product;
import com.example.demo.product.ProductRepository;


@SpringBootApplication
public class ECommerceApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Product("shirt",7));
		repo.save(new Product("shorts",7));
		repo.save(new Product("sneakers",7));
	}

}
