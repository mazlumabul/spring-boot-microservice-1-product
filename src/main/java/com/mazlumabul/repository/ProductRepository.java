package com.mazlumabul.repository;

import com.mazlumabul.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //Product findByPriceAnd();
    //Product findByName(String name);

    // veya
    //@Query("select * from Product ");

    // şeklinde hazır metotlar var veya nen kendim query ile db operasyonları yazarım
}
