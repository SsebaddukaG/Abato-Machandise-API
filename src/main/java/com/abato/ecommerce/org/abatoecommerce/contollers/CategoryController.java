package com.abato.ecommerce.org.abatoecommerce.contollers;

import com.abato.ecommerce.org.abatoecommerce.model.Product;
import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import com.abato.ecommerce.org.abatoecommerce.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "category")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @RequestMapping(value = "/addMainCategory", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
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

    @RequestMapping(value = "/findCategoryByCategoryCode/{categoryCode}", method = RequestMethod.GET)
    public ProductCategory findByCategoryCode(@PathVariable String categoryCode){
        return categoryService.findByCategoryCode(categoryCode).get();
    }

    @RequestMapping(value = "/addSubcategory/{categoryCode}", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ProductCategory addSubCategory(@PathVariable String categoryCode,@RequestBody ProductCategory category){
        return categoryService.addSubCategory(categoryCode,category);
    }
}
