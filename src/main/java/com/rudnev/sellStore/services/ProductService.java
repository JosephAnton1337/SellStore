package com.rudnev.sellStore.services;


import com.rudnev.sellStore.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(ID++, "PlayStation5", "discription", 67000, "Moscow", "Tom"));
        products.add(new Product(ID++, "IphoneX", "discription", 24000, "Krasnodar", "Jack"));
    }

    public List<Product> listProducts() {
        return products;
    }


    public void saveProduct(Product product) {
        product.setId(ID++);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));// удаление объекта по совпадению id
    }


    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
