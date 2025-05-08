package com.dmarqss.stockFlowWeb.repository.productsRespository;

import com.dmarqss.stockFlowWeb.models.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByEan(Long ean);
}
