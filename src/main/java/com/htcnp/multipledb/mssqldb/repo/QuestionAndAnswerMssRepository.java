package com.htcnp.multipledb.mssqldb.repo;

import com.htcnp.multipledb.mssqldb.entity.QuestionAndAnswerMSS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAndAnswerMssRepository extends JpaRepository<QuestionAndAnswerMSS, Integer> {
}
