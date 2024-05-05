package com.turkcell.orderservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "productservice")
public interface ProductServiceClient {
    @GetMapping("/product/getProduct")
    int getProduct(@RequestParam int productId);
}
