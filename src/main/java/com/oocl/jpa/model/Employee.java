package com.oocl.jpa.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @GeneratedValue
  private int id;
  private String name;

  @Column(name = "company_id")
  private int companyId;

  @OneToOne
  @JoinColumn
  private EmployeeRecord record;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCompanyId() {
    return companyId;
  }

  public void setCompanyId(int companyId) {
    this.companyId = companyId;
  }

  public EmployeeRecord getRecord() {
    return record;
  }

  public void setRecord(EmployeeRecord record) {
    this.record = record;
  }
}

