package com.dmarqss.stockFlowWeb.controller.products;

import com.dmarqss.stockFlowWeb.models.products.ProductRequestDto;
import com.dmarqss.stockFlowWeb.service.productService.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "stock")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ModelAndView pageViewStock(){
        ModelAndView mv = new ModelAndView("viewStock");
        mv.addObject("products", productService.listAll());
        return mv;
    }

    @PostMapping
    public String createProduct(@Valid ProductRequestDto data){
        productService.createProduct(data);
        return "redirect:/stock";
    }


    @GetMapping(path = "addProduct")
    public ModelAndView pageAddProduct(){
        ModelAndView mv = new ModelAndView("addProduct");
        return mv;
    }


    @GetMapping(path = "edit")
    public ModelAndView showEditPage(Long ean){
        ModelAndView mv = new ModelAndView("editPage");
        mv.addObject("product",productService.showByEan(ean));
        System.out.println(productService.showByEan(ean));
        return mv;
    }
    @PostMapping(path = "edit")
    public String updateProduct(@Valid ProductRequestDto data){
        productService.updateProduct(data);
        return "redirect:/stock";
    }

    @PostMapping(path = "edit/delete")
    public String deleteProduct(Long ean){
        productService.deleteProduct(ean);
        return "redirect:/stock";
    }
}
