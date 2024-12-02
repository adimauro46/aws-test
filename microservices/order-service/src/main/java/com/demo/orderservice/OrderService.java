package com.demo.orderservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
 
    @Autowired
    private PurchaseOrderRepository orderRepository;

    @Autowired
    private ProductClient productClient;

    public List<PurchaseOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public PurchaseOrder getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public PurchaseOrder addOrder(PurchaseOrder order) {
        Product product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
