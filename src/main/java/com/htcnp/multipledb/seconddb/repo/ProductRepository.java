package com.htcnp.multipledb.seconddb.repo;

import com.htcnp.multipledb.seconddb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
