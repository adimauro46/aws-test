package com.demo.inventoryservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory {
    @Id
    private String productId;
    public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	private int quantity;
    
    // Getters and setters
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
