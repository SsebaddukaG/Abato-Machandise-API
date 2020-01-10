package com.abato.ecommerce.org.abatoecommerce.services;

import com.abato.ecommerce.org.abatoecommerce.dao.ProductRepository;
import com.abato.ecommerce.org.abatoecommerce.model.Product;
import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;

    @Override
    public Product addProduct(String categoryCode, Product product) {
        if (product!=null ) {
            ProductCategory category;
            if (categoryCode.equals("") || categoryCode==null ){
                if (categoryService.findAllCategories().size()>0){
                    category = categoryService.findAllCategories().get(0);
                    product.setCategory(category);
                    return  productRepository.save(product);
                }
            }
            else {
                category = categoryService.findByCategoryCode(categoryCode).get();
                product.setCategory(category);
                productRepository.save(product);
                System.err.println(product);
                return product;
            }
        }
            return null;
    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public void updateProduct(String productCode) {

    }
}
