package com.mazlumabul.service.concretes;

import com.mazlumabul.model.Product;
import com.mazlumabul.repository.ProductRepository;
import com.mazlumabul.service.abstracts.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductManager implements ProductService {
    // 3 farklı ınjection vardır
    /* Detay için notlar> bloglar> dependcy Injection

    @Autowired
    private ProductRepository productRepository;
     */
    // cunstructor

    private final ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @Override
    public Product saveProduct(Product product) {
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
    productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
