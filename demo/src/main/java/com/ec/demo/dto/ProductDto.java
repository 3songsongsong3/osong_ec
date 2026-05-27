package com.ec.demo.dto;

import java.time.LocalDate;


import lombok.Getter;
import lombok.Setter;

/**
 * 商品DTO
 */

@Getter
@Setter
public class ProductDto {

    private Integer productId;
    private String productName;
    private Integer price;
    private Integer stock;
    private String description;
    private String imageUrl;
    private String categoryCode;
    private LocalDate createdDate;
    private LocalDate updateDate;
}