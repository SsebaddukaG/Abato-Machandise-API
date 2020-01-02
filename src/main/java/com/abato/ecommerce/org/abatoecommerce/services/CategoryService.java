package com.abato.ecommerce.org.abatoecommerce.services;

import com.abato.ecommerce.org.abatoecommerce.dao.ICategoryRepository;
import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public ProductCategory addCategory(ProductCategory category) {
        if (category!=null){
            return categoryRepository.save(category);
        }
        return null;
    }

}
