package com.dmarqss.stockFlowWeb.controller.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "home")
public class HomeControler {

    @GetMapping
    public String homePage(){
        return "homePage";
    }

}
