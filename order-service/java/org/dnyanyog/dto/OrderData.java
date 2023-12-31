package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class OrderData 
{
	private int productId;
	private double totalprice;
	private int quantity;
	private int orderId;
	private String mssage;
	private String staus;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double gettotalprice() {
		return totalprice;
	}
	public void settotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrderid() {
		return orderId;
	}
	public void setOrderid(int orderId) {
		this.orderId = orderId;
	}
	public String getMssage() {
		return mssage;
	}
	public void setMssage(String mssage) {
		this.mssage = mssage;
	}
	public String getStaus() {
		return staus;
	}
	public void setStaus(String staus) {
		this.staus = staus;
	}
	
	

}