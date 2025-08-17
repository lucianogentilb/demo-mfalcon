package com.mfalcon.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfalcon.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
