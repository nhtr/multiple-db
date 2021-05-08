package com.htcnp.multipledb.orcldb.repo;

import com.htcnp.multipledb.orcldb.entity.QuestionAndAnswerOracle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionAndAnswerOrclRepository extends JpaRepository<QuestionAndAnswerOracle, Integer> {
}
