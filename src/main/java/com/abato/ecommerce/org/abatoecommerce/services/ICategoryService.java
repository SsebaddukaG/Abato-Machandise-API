package com.abato.ecommerce.org.abatoecommerce.services;

import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    ProductCategory addCategory(ProductCategory category);
    List<ProductCategory> findAllCategories();
    ProductCategory addSubCategory(String categoryCode,ProductCategory category);

    public boolean existsByName(String categoryName);

    Optional<ProductCategory> getCategoryById(int id);

    Optional<ProductCategory> findByCategoryCode(String categoryCode);

    void removeCategory(ProductCategory category);

    Iterable<ProductCategory> getAllCategories();

    Optional<ProductCategory> findCategoryByName(String categoryName);
}
