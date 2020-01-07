package com.abato.ecommerce.org.abatoecommerce.services;

import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    ProductCategory addCategory(ProductCategory category);

    Optional<ProductCategory> getCategoryById(int id);

    void removeCategory(ProductCategory category);

    Iterable<ProductCategory> getAllCategories();

    Optional<ProductCategory> findCategoryByName(String categoryName);
}
