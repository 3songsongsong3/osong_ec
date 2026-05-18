package com.ec.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ec.demo.entity.Product;
import com.ec.demo.service.ProductService;

/**
 *　ホーム画面
 *
 * @author Eugene
 */
@Controller
public class HomeController {
	
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
    public HomeController(ProductService productService) {
        this.productService = productService;
    }
    
	/**
	 * ホーム画面を表示
	 * @param Model model
	 * @return HTML page
	 */
	@GetMapping("/")
	public String getHome(Model model) {
		
		//　NewArrivals データ取得
		List<Product> products = productService.findLatestProducts();
		model.addAttribute("products", products);
		
		return "index";
	}
	
}
