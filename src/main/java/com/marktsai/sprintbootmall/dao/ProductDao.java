package com.marktsai.sprintbootmall.dao;

import com.marktsai.sprintbootmall.dto.ProductRequest;
import com.marktsai.sprintbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId ,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
