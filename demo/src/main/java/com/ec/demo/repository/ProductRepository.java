package com.ec.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ec.demo.entity.Product;

/**
 * 商品リポジトリ
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findTop8ByOrderByCreatedDateDesc();
}