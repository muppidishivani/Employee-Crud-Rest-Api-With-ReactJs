package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Employee;
import com.web.repository.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {
@Autowired
private EmployeeRepo repo;

@Override
public Employee saveEmp(Employee employee) {
	double ta=0.0,da=0.0,hra=0.0,pf=0.0,netsal,g;
	double sal=employee.getSalary();
	if(sal<30000) {
		ta=(sal*0.7)/100;
		da=(sal*0.9)/100;
		hra=(sal*1.1)/100;
		pf=(sal*1.5)/100;
	}
	else if(sal>=30000 && sal<50000) {
		ta=(sal*1.2)/100;
		da=(sal*1.3)/100;
		hra=(sal*1.7)/100;
		pf=(sal*2.2)/100;
	}
	
	else {
		ta=(sal*1.7)/100;
		da=(sal*1.9)/100;
		hra=(sal*2.1)/100;
		pf=(sal*2.5)/100;
	}
	g=sal+ta+da+hra;
	netsal=g-pf;
	employee.setSalary(sal);
	employee.setDa(da);
	
	employee.setHra(hra);
	employee.setTa(ta);
	employee.setPf(pf);
	employee.setGrosssal(g);
	employee.setNetsal(netsal);
		return repo.save(employee);
}

@Override
public List<Employee> getAll() {
	List<Employee> data=(List<Employee>)repo.findAll();
	return data;
}

@Override
public Employee getOne(int empNo) {
	Employee emp=repo.findById(empNo).get();

	return emp;
}

@Override
public void delete(int empNo) {
	repo.deleteById(empNo);
}

@Override
public Employee update(Employee employee, int empNo) {
	Employee oldRecord=repo.findById(empNo).get();
	oldRecord.setEmpName(employee.getEmpName());
	oldRecord.setSalary(employee.getSalary());
	return repo.save(oldRecord);
}



}

