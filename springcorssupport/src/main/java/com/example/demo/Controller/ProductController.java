package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;

import antlr.debug.NewLineEvent;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@CrossOrigin(origins = "http://localhost:9090")
	@GetMapping("/products1")
	public Object getProduct() {
		productService.getProduct();
		return new ResponseEntity(HttpStatus.OK).getBody();
	}

	@GetMapping("/prod")
	public Object getProductDetails() {
		productService.getProduct();
		return new ResponseEntity(HttpStatus.OK).getBody();
	}

}
