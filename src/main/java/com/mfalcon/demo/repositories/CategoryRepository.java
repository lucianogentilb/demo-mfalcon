package com.mfalcon.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfalcon.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
