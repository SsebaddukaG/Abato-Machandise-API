package com.abato.ecommerce.org.abatoecommerce.dao;

import com.abato.ecommerce.org.abatoecommerce.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;
@Repository
public class ProductRepository extends AbstractDAO<Product> {


    /*protected EntityManager entityManager;

    @Override
    public <S extends Product> S save(S s) {
        if (s!=null) entityManager.persist(s);
        return s;
    }*/

    @Override
    public Optional<Product> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Product> findAll() {
        return entityManager.createNativeQuery("select * from product").getResultList();
    }
}
