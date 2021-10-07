package com.mazlumabul.service.abstracts;

import com.mazlumabul.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    void  deleteProduct(Long productId);
    List<Product> findAllProducts();
}
