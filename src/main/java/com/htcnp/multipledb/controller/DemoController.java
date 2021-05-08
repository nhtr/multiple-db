package com.htcnp.multipledb.controller;

import com.htcnp.multipledb.firstdb.entity.Customer;
import com.htcnp.multipledb.firstdb.repo.CustomerRepository;
import com.htcnp.multipledb.mssqldb.repo.FunctionMssRepository;
import com.htcnp.multipledb.mssqldb.repo.QuestionAndAnswerMssRepository;
import com.htcnp.multipledb.orcldb.entity.FunctionOracle;
import com.htcnp.multipledb.orcldb.entity.QuestionAndAnswerOracle;
import com.htcnp.multipledb.orcldb.repo.FunctionOrclRepository;
import com.htcnp.multipledb.orcldb.repo.QuestionAndAnswerOrclRepository;
import com.htcnp.multipledb.seconddb.entity.Product;
import com.htcnp.multipledb.seconddb.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DemoController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FunctionOrclRepository functionOracleRepo;

    @Autowired
    private FunctionMssRepository functionMSSRepo;

    @Autowired
    private QuestionAndAnswerMssRepository qamssRepo;

    @Autowired
    private QuestionAndAnswerOrclRepository qaOracleRepo;

    @GetMapping(value = "customer")
    public ResponseEntity<List<Customer>> Test() {
        List<Customer> data = customerRepository.findAll();
        return ResponseEntity.ok(data);
    }

    @GetMapping(value = "product")
    public ResponseEntity<List<Product>> TestProduct() {
        List<Product> data = productRepository.findAll();
        return ResponseEntity.ok(data);
    }

    @PostMapping(value = "save-customer")
    public ResponseEntity<List<Customer>> InsertCustomer(@RequestBody List<Customer> customerList) {
        List<Customer> data = customerRepository.findAll();
        List<Customer> inserted = customerRepository.saveAll(customerList);
        return ResponseEntity.ok(inserted);
    }

    @PostMapping(value = "hit")
    public ResponseEntity<String> HitIt() {
        List<FunctionOracle> lsFunction  = functionMSSRepo.findAll().stream().map(item -> {
            FunctionOracle oracle = new FunctionOracle();
            oracle.setId(item.getId());
            oracle.setName(item.getName());
            oracle.setDescription(item.getDescription());
            return oracle;
        }).collect(Collectors.toList());
        //---
        functionOracleRepo.saveAll(lsFunction);

        // ----------------table QA
        List<QuestionAndAnswerOracle> lsQA = qamssRepo.findAll().stream().map(item -> {
            QuestionAndAnswerOracle oracle = new QuestionAndAnswerOracle();
            oracle.setId(item.getId());
            oracle.setIdSP(item.getIdSP());
            oracle.setChuDeCap1(item.getChuDeCap1());
            oracle.setChuDeCap2(item.getChuDeCap2());
            oracle.setNdCauHoi(item.getNdCauHoi());
            oracle.setNdCauTraLoi(item.getNdCauTraLoi());
            oracle.setTrangThai(item.getTrangThai());
            oracle.setNgayTao(item.getNgayTao());
            oracle.setNguoiTao(item.getNguoiTao());
            oracle.setNgaySua(item.getNgaySua());
            oracle.setNguoiSua(item.getNguoiSua());
            oracle.setIsDuyet(item.getIsDuyet());
            oracle.setNgayDuyet(item.getNgayDuyet());
            oracle.setNguoiDuyet(item.getNguoiDuyet());
            oracle.setLyDoTuChoi(item.getLyDoTuChoi());
            return  oracle;
        } ).collect(Collectors.toList());
        qaOracleRepo.saveAll(lsQA);


        return ResponseEntity.ok("ok");
    }
}
