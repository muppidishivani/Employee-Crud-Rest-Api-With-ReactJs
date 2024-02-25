package com.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
