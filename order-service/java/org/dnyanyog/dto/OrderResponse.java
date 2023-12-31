package org.dnyanyog.dto;

public class OrderResponse
{
	private String status;
	private String mssage;
	private int productId;
	private int orderId;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMssage() {
		return mssage;
	}
	public void setMssage(String mssage) {
		this.mssage = mssage;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	


}