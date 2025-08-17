package com.mfalcon.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfalcon.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
