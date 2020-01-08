package com.abato.ecommerce.org.abatoecommerce.services;

import com.abato.ecommerce.org.abatoecommerce.dao.CategoryRepository;
import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CategoryServiceTest {

    @InjectMocks
    private CategoryService categoryService;

    @Mock
    private CategoryRepository categoryRepository;

    private ProductCategory category;

    private Map<Integer,ProductCategory> categoryMap;


    @Before
    public void setUp() throws Exception {
        category = new ProductCategory("clothes",1);
        when(categoryRepository.save(category)).thenReturn(category);

        categoryMap = new HashMap<>();
        categoryMap.put(1,new ProductCategory("Clothes",1));
        categoryMap.put(2,new ProductCategory("abato",2));
        categoryMap.put(3,new ProductCategory("shoes",3));

    }

    @Test
    public void addCategory() {
        Assert.assertEquals(category,categoryService.addCategory(category));
    }

    @Test
    public void getCategoryById() {
        when(categoryRepository.findById(2)).thenReturn(Optional.of(categoryMap.get(2)));
        Assert.assertTrue(categoryMap.get(2).equals(categoryService.getCategoryById(2).get()));
    }

    @Test
    public void removeCategory() {
    }

    @Test
    public void getAllCategories() {

    }

    @Test
    public void findCategoryByName() {

       when(categoryRepository.findCategoryByName("Clothes")).thenReturn(Optional.of(categoryMap.get(1)));

        Assert.assertEquals(Optional.of(new ProductCategory("Clothes",1)),categoryService.findCategoryByName("Clothes"));
    }

    @Test
    public void addSubCategory() {
       // Assert.assertEquals(category,categoryService.addSubCategory(1,category));
    }

    @Test
    public void existsByName() {
        when(categoryRepository.existsByName(categoryMap.get(2).getCategoryName())).thenReturn(true);

        Assert.assertEquals(true,categoryService.existsByName("abato"));
    }
}