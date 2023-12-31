package org.dnyanyog.serivce;

import java.util.Optional;

import org.dnyanyog.dto.OrderRequest;
import org.dnyanyog.dto.OrderResponse;
import org.dnyanyog.dto.OrderData;
import org.dnyanyog.entity.Orders;
import org.dnyanyog.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repo;
	
	public OrderData searchOrderDetails(int orderId) {
		OrderData response = new OrderData();
		
		Optional<Orders> order = repo.findById(orderId);
		if(order.isEmpty()) {
			response.setStaus("Fail");
			response.setMssage("order not found");
		}else {
			Orders ord = order.get();
			response.setStaus("Success");
			response.setMssage("Order found successfully");
			response.setProductId(ord.getProductId());
			response.setOrderid(ord.getOrderId());
			response.settotalprice(ord.gettotalprice());
			response.setQuantity(ord.getQuantity());
		
		}
		
		return response;	
	}
	
	public OrderResponse getOrder(OrderRequest request) {
		OrderResponse response = new OrderResponse();
		
		Orders order = new Orders();
		
		order.setProductId(request.getProductId());
		order.settotalprice(request.gettotalprice());
		order.setQuantity(request.getQuantity());
		
		order = repo.save(order);
		
		response.setMssage("Order place successfully");
		response.setStatus("Success");
		response.setOrderId(order.getOrderId());
		
		return response;
		
	}
	
	public String cancleOrder(int orderId) {
		  repo.deleteById(orderId);
		  return "deleted "+orderId;
		
	}

}