package com.jesus.springboot.di.app.springboot_di.repositories;

import java.util.Arrays;
import java.util.List;

import com.jesus.springboot.di.app.springboot_di.models.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Memoria Corsair 32", 300L),
            new Product(2L, "CPU Intel Core I9", 550L),
            new Product(3L, "Ryzen A600", 650L),
            new Product(4L, "Mouse NVIDIA", 40L)
        );
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}