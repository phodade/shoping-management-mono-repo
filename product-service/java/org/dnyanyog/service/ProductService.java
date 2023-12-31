package org.dnyanyog.service;

import java.util.Optional;

import org.dnyanyog.dto.ProductRequest;
import org.dnyanyog.dto.ProductResponse;
import org.dnyanyog.entity.Product;
import org.dnyanyog.repo.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductsRepository repo;
	
	public ProductResponse addProduct(ProductRequest request) {
		ProductResponse response = new ProductResponse();
		
		Product product = new Product();
		
		product.setProductName(request.getProductName());
		product.setPrice(request.getPrice());
		product.setQuantity(request.getQuantity());
		
		product = repo.save(product);
		
		response.setStatus("Success");
		response.setMessage("Product added successfully!!");
		response.setProductname(request.getProductName());
		response.setPrice(request.getPrice());
		response.setQuantity(request.getQuantity());
		response.setProductId(product.getProductId());
		return response;
		
	}
	
	public Product editProduct(Product product) {
		Product editProduct = repo.findById(product.getProductId()).get();
		
		if(editProduct!=null) {
			editProduct.setProductName(product.getProductName());
			editProduct.setPrice(product.getPrice());		
			editProduct.setQuantity(product.getQuantity());
			
			editProduct = repo.save(editProduct);
			return editProduct;
		}
		return null;
	}
	

}