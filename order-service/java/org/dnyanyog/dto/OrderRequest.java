package org.dnyanyog.dto;

public class OrderRequest
{
	private int productId;
	private double totalprice;
	private int quantity;
	private int orderId;
	
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
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	

}