package com.abato.ecommerce.org.abatoecommerce.dao;

import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryRepository extends AbstractDAO<ProductCategory> {
    @Override
    public Optional<ProductCategory> findById(Integer integer) {
        return this.findAllCategories().stream().filter(category -> category.getcId() == integer).findFirst();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<ProductCategory> findAll() {
        Iterable<ProductCategory> iterable = findAllCategories();
        return iterable;
    }

    /*public Optional<T> findByName(String name){
        return entityManager.createNativeQuery("select ")
    }*/

    public List<ProductCategory> findAllCategories() {
        return entityManager.createNativeQuery("select * from product_category", ProductCategory.class).getResultList();
    }

}
