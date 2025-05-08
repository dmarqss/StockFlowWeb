package com.dmarqss.stockFlowWeb.service.productService;


import com.dmarqss.stockFlowWeb.models.products.Product;
import com.dmarqss.stockFlowWeb.models.products.ProductRequestDto;
import com.dmarqss.stockFlowWeb.repository.productsRespository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public HttpStatus createProduct(ProductRequestDto data) {

        productRepository.save(new Product(

                data.ean(),
                data.name(),
                data.price(),
                data.amount(),
                data.type())
        );
        return HttpStatus.OK;
    }

    public List<Product> listAll(){
        return productRepository.findAll();
    }

    public Product showByEan(Long ean){
        return productRepository.findByEan(ean);
    }

    public HttpStatus updateProduct(ProductRequestDto data){
        Product product = productRepository.findByEan(data.ean());
        product.setName(data.name());
        product.setPrice(data.price());
        product.setAmount(data.amount());
        product.setType(data.type());

        productRepository.save(product);
        return HttpStatus.OK;
    }

    public HttpStatus deleteProduct(Long ean){
        Product product = productRepository.findByEan(ean);
        productRepository.delete(product);
        return HttpStatus.OK;
    }

}
