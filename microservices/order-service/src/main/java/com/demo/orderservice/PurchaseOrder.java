package com.demo.orderservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PurchaseOrder {
   @Id
    private String id;
    public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
	private String productId;
    private int quantity;
    // Getters and setters
	
    public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
