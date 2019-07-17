package com.oocl.jpa.controller;

import com.oocl.jpa.model.Company;
import com.oocl.jpa.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

  @Autowired
  private CompanyRepository companyRepository;

  @PostMapping
  public Company addCompany(@RequestBody Company company) {
    return companyRepository.save(company);
  }

  @DeleteMapping("{companyId}")
  public void deleteCompany(@PathVariable Integer companyId) {
    companyRepository.deleteById(companyId);
  }

  @PutMapping("{companyId}")
  public void updateCompany(@RequestBody Company company, @PathVariable Integer companyId) {
    company.setId(companyId);
    companyRepository.save(company);
  }

  @GetMapping
  public List<Company> findAll() {
    return companyRepository.findAll();
  }
}
