package com.abato.ecommerce.org.abatoecommerce.services;

import com.abato.ecommerce.org.abatoecommerce.model.Product;
import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;

public interface IProductService {
    Product addProduct(String categoryCode, Product product);
    void deleteProduct(Product product);
    void updateProduct(String productCode);
}
