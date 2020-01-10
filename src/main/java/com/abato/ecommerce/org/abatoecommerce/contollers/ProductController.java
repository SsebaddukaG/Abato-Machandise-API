package com.abato.ecommerce.org.abatoecommerce.contollers;

import com.abato.ecommerce.org.abatoecommerce.model.Product;
import com.abato.ecommerce.org.abatoecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "test")
    public String print(){
        return "hello";
    }

    @PostMapping(value = "/addProduct/{categoryCode}")
    public Product addProduct(@PathVariable String categoryCode, @RequestBody Product product){
        return productService.addProduct(categoryCode,product);
    }
}
