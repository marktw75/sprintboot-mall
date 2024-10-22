package com.marktsai.sprintbootmall.service.impl;

import com.marktsai.sprintbootmall.dao.ProductDao;
import com.marktsai.sprintbootmall.model.Product;
import com.marktsai.sprintbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}