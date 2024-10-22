package com.marktsai.sprintbootmall.dao.impl;

import com.marktsai.sprintbootmall.dao.ProductDao;
import com.marktsai.sprintbootmall.model.Product;
import com.marktsai.sprintbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer id) {
        String sql = "SELECT product_id, product_name, category, image_url, price, stock, description, " +
                "created_date, last_modified_date " +
                "from product where product_id = :product_id";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("product_id", id);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if (productList.size() > 0) {
            return productList.get(0);
        } else {
            return null;
        }

    }
}
