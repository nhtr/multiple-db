package com.htcnp.multipledb.orcldb.repo;

import com.htcnp.multipledb.orcldb.entity.FunctionOracle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionOrclRepository extends JpaRepository<FunctionOracle, Integer> {
}
