package com.htcnp.multipledb.firstdb.repo;

import com.htcnp.multipledb.firstdb.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer > {
}

