package com.example.demo.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	//api to get all products
		@GetMapping("/products")
		public List<Product> getAuths(){
			return service.findAll();
		}
		
		//api to create products
		@PostMapping("/product")
		public Product createProduct(@RequestBody Product product) {
			return service.save(product);
		}
		
		//api to update product
		@PutMapping("/product")
		public Product updateProduct(@RequestBody Product product) {
			return service.save(product);
		}
		
		//api to delete product
		@DeleteMapping("/product/{id}")
		public void deleteProduct(@PathVariable Long id) {
			service.delete(id);
			
		}
		
		//api to get an product
		@GetMapping("/product/{id}")
		public Product getProduct(@PathVariable Long id) {
			return service.findById(id);
		}
		
		//api to get an product count
		@GetMapping("/product/count")
		public Long getCount() {
			return service.count();
		}
}
