package com.abato.ecommerce.org.abatoecommerce.contollers;

import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import com.abato.ecommerce.org.abatoecommerce.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "category")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public ProductCategory addCategory(@RequestBody ProductCategory category) {
        return categoryService.addCategory(category);
    }

    @RequestMapping(value = "/getCategoryById/{id}", method = RequestMethod.GET)
    public ProductCategory getCategoryById(@PathVariable int id){
        return categoryService.getCategoryById(id).get();
    }

    @RequestMapping(value = "/getAllCategories", method = RequestMethod.GET)
    public Iterable<ProductCategory> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @RequestMapping(value = "/findCategoryByName/{categoryName}", method = RequestMethod.GET)
    public Optional<ProductCategory> findCategoryByName(@PathVariable String categoryName){
        return categoryService.findCategoryByName(categoryName);
    }
}
