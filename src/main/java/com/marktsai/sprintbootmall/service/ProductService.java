package com.marktsai.sprintbootmall.service;

import com.marktsai.sprintbootmall.dto.ProductRequest;
import com.marktsai.sprintbootmall.model.Product;
import jakarta.validation.Valid;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
