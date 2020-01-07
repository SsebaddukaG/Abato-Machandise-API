package com.abato.ecommerce.org.abatoecommerce.services;

import com.abato.ecommerce.org.abatoecommerce.dao.CategoryRepository;
import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@Transactional
@Configuration
@ComponentScan
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ProductCategory addCategory(ProductCategory category) {
        if (category!=null){
            return categoryRepository.save(category);
        }
        return null;
    }

    @Override
    public Optional<ProductCategory> getCategoryById(int id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void removeCategory(ProductCategory category) {
        if (category!=null) categoryRepository.delete(category);
    }

    @Override
    public Iterable<ProductCategory> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<ProductCategory> findCategoryByName(String categoryName) {
        return categoryRepository.findAllCategories().stream()
                .filter(category -> category.getCategoryName().equals(categoryName))
                .findFirst();
    }

}
