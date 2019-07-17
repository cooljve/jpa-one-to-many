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

  @GetMapping
  public List<Company> findAll() {
    return companyRepository.findAll();
  }
//
//  @GetMapping("{companyName}")
//  public Company findByCompanyName(@PathVariable String companyName) {
//    return companyService.findByCompanyName(companyName);
//  }
//
//  @GetMapping("{companyName}/employees")
//  public List<Employee> findEmployeesByCompanyName(@PathVariable String companyName) {
//    return companyService.findEmployeesByCompanyName(companyName);
//  }
//
//  @GetMapping(params = {"page","pageSize"})
//  public List<Company> findByPageAndPageSize(@RequestParam int page, @RequestParam int pageSize) {
//    return companyService.findByPageAndPageSize(page, pageSize);
//  }

  @PostMapping
  public Company addCompany(@RequestBody Company company) {
    return companyRepository.save(company);
  }

  @PutMapping("{companyId}")
  public void updateCompany(@RequestBody Company company, @PathVariable Integer companyId) {
//    return companyService.update(company, companyId);
  }

  @DeleteMapping("{companyId}")
  public void deleteCompany(@PathVariable Integer companyId) {
    Company company = companyRepository.getOne(companyId);
    companyRepository.delete(company);
  }
}
