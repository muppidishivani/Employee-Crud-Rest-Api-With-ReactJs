package com.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Employee;
import com.web.service.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {
@Autowired
private EmployeeService service;
@PostMapping("/save")
public Employee saveData(@RequestBody Employee employee)
{
	Employee p=service.saveEmp(employee);
	return p;
}
@GetMapping("/getAll")
public List<Employee> getdata()
{
	List<Employee> emp=service.getAll();
	return emp;
}
@GetMapping("/get/{empNo}")
public Employee getDta(@PathVariable int empNo)
{
	Employee e=service.getOne(empNo);
	return e;
}
@DeleteMapping("/delete/{empNo}")
public void deleteData(@PathVariable int empNo)
{
	service.delete(empNo);
}
@PutMapping("/update/{empNo}")
public Employee updateData(@RequestBody Employee employee,@PathVariable int empNo)
{
	Employee e1=service.update(employee, empNo);
	return e1;
}
}
