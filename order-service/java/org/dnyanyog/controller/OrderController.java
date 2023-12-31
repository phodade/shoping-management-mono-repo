package org.dnyanyog.controller;

import org.dnyanyog.dto.OrderRequest;
import org.dnyanyog.dto.OrderResponse;
import org.dnyanyog.serivce.OrderService;
import org.dnyanyog.dto.OrderData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping("/auth/validate/order/{id}")
	public OrderData getOrder(@PathVariable int id) {
		return service.searchOrderDetails(id);
	}
	
	@PostMapping("/auth/validate/order")
	public OrderResponse getOrder(@RequestBody OrderRequest OrderRequest) {
		return service.getOrder(OrderRequest);
	}
	
	@DeleteMapping("/auth/validate/order/{orderId}")
	public String cancleOrder(@PathVariable int orderId) {
		return service.cancleOrder(orderId);
	}

}