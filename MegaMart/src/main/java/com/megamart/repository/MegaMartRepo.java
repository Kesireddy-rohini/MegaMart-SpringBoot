package com.megamart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.megamart.entity.Product;

@Repository
public interface MegaMartRepo extends CrudRepository<Product, Integer> {

}
