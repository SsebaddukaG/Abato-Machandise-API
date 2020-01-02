package com.abato.ecommerce.org.abatoecommerce.dao;

import com.abato.ecommerce.org.abatoecommerce.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends CrudRepository<ProductCategory,Integer> {
}
