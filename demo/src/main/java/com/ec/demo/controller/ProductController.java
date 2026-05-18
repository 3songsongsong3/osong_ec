package com.ec.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ec.demo.entity.Product;
import com.ec.demo.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	/**
     * 商品サービス
     */
    private final ProductService productService;
    
    /**
     * コンストラクタ
     *
     * Spring が ProductService を自動的に注入する。
     *
     * @param productService 商品サービス
     */
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
	
	@GetMapping
	public String getProductsPage(Model model) {
		List<Product> product = productService.findAll();
		model.addAttribute("products", product);
		
		return "collection";
	}
}
