package com.abato.ecommerce.org.abatoecommerce.services;

import com.abato.ecommerce.org.abatoecommerce.dao.ICategoryRepository;
import com.abato.ecommerce.org.abatoecommerce.model.Product;
import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
@SpringBootTest
public class CategoryServiceTest {

    @Autowired
    private CategoryService service;

    @MockBean
    private ICategoryRepository repository;

    @Test
    public void addCategory() {
        ProductCategory category = new ProductCategory();
        category.setCategoryName("Abato");
        category.setcId(1);

        when(repository.save(category)).thenReturn(category);
        assertEquals(category,service.addCategory(category));
    }
}