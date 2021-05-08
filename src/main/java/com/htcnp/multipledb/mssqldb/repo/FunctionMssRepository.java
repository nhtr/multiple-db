package com.htcnp.multipledb.mssqldb.repo;

import com.htcnp.multipledb.mssqldb.entity.FunctionMSS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionMssRepository extends JpaRepository<FunctionMSS, Integer> {
}
