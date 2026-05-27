package com.ec.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ec.demo.entity.Product;
import com.ec.demo.repository.ProductRepository;

/**
 * 商品サービス
 */
@Service
public class ProductService {
	 
	@Value("${aws.s3.base-url-products}")
    private String s3BaseUrl;

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * 商品一覧を取得する。
     *
     * @return 商品一覧
     */
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    /**
     * 商品IDで商品を取得する。
     *
     * @param productId 商品ID
     * @return 商品情報
     */
    public Product findById(Integer productId) {
        return productRepository.findById(productId).orElse(null);
    }
    
    /**
     * 最新の商品8件を取得する。
     *
     * 作成日(createdDate)の降順で並び替え、
     * 新しく登録された商品から最大8件取得する。
     *
     * @return 最新の商品一覧（最大8件）
     */
    public List<Product> findLatestProducts() {
        return productRepository.findTop8ByOrderByCreatedDateDesc();
    }
    
    public String getImageUrl(Product product) {
        return s3BaseUrl + product.getImageUrl();
    }
}