package com.shopping.cart.controller;

import com.shopping.cart.repository.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiv1/products")
public class ProductController {

    private final ProductRepository productRepository;

}
