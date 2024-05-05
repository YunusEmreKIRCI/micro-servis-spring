package com.turkcell.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    @GetMapping("/getProduct")
    public int getProduct(@RequestParam int productId) {
        System.out.println("ProductController.getProduct" + productId);

        return 5;
    }
}
