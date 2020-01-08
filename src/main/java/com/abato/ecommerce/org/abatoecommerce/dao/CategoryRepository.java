package com.abato.ecommerce.org.abatoecommerce.dao;

import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryRepository extends AbstractDAO<ProductCategory> {
    @Override
    public Optional<ProductCategory> findById(Integer integer) {
        return this.findAllCategories().stream().filter(category -> category.getCId() == integer).findFirst();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    public boolean existsByName(String name){
        if (name!=null){
            return this.findAllCategories().stream().anyMatch(category -> category.getCategoryName().equalsIgnoreCase(name));
        }
        return false;
    }

    public Optional<ProductCategory> findCategoryByName(String categoryName) {
        return this.findAllCategories().stream()
                .filter(category -> category.getCategoryName().equals(categoryName))
                .findFirst();
    }

    @Override
    public Iterable<ProductCategory> findAll() {
        Iterable<ProductCategory> iterable = findAllCategories();
        return iterable;
    }

    public Optional<ProductCategory> findByCategoryCode(String categoryCode){
        return this.findAllCategories().stream()
                .filter(category -> category.getCategoryCode().equalsIgnoreCase(categoryCode))
                .findFirst();
    }

    public List<ProductCategory> findAllCategories() {
        return entityManager.createNativeQuery("select * from product_category", ProductCategory.class).getResultList();
    }

}
