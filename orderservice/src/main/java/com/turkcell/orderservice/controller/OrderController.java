package com.turkcell.orderservice.controller;

import com.turkcell.orderservice.clients.ProductServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    //private final WebClient.Builder webClientBuilder;
    //manuel göndermek için ihtiyacımız vardı ama şimdi feign client ile yapacağız
    private final ProductServiceClient productServiceClient;
    @GetMapping
    public String createOrder(@RequestParam int productId) {
        /*
        manuel göndermek için ihtiyacımız vardı ama şimdi feign client ile yapacağız
        var result = webClientBuilder
                .build()
                .get()
                .uri("http://localhost:8082/product/getProduct")
                .retrieve().bodyToMono(Integer.class)
                .block();

        return "Order created " + result;*/
        int result = productServiceClient.getProduct(productId);
        return "Order created " + result;
    }
}
