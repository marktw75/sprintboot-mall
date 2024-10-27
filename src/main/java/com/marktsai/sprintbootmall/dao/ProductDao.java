package com.marktsai.sprintbootmall.dao;

import com.marktsai.sprintbootmall.constant.ProductCategory;
import com.marktsai.sprintbootmall.dto.ProductQueryParams;
import com.marktsai.sprintbootmall.dto.ProductRequest;
import com.marktsai.sprintbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId ,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
