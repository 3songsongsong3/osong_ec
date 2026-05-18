package com.ec.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 商品エンティティ
 *
 * product テーブルに対応する。
 *
 * @author Eugene
 */
@Entity
@Table(name = "product")
public class Product {

    /**
     * 商品ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 商品名
     */
    @Column(name = "product_name", nullable = false, length = 255)
    private String productName;

    /**
     * 価格
     */
    @Column(name = "price", nullable = false)
    private Integer price;

    /**
     * 在庫数
     */
    @Column(name = "stock", nullable = false)
    private Integer stock;

    /**
     * 商品説明
     */
    @Column(name = "description", nullable = false)
    private String description;

    /**
     * 商品画像URL
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * カテゴリコード
     */
    @Column(name = "category_code", nullable = false, length = 4)
    private String categoryCode;

    /**
     * 作成日
     */
    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;

    /**
     * 更新日
     */
    @Column(name = "update_date")
    private LocalDate updateDate;

    public Product() {
    }

    // Getter / Setter

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}