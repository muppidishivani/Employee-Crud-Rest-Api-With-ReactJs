package com.web.service;

import java.util.List;

import com.web.model.Employee;

public interface EmployeeService {
public Employee saveEmp(Employee employee);
public List<Employee> getAll(); 
public Employee getOne(int empNo);
public void delete(int empNo);
public Employee update(Employee employee,int empNo);
}
