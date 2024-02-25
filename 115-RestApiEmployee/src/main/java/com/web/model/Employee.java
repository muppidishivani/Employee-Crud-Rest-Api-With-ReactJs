package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empNo;
	private String empName;
	private double salary;
	private double ta;
	private double da;
	private double hra;
	private double pf;
	private double grosssal;
	private double netsal;
	public Employee() {
		super();
	}
	public Employee(int empNo, String empName, double salary, double ta, double da, double hra, double pf,
			double grosssal, double netsal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.grosssal = grosssal;
		this.netsal = netsal;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGrosssal() {
		return grosssal;
	}
	public void setGrosssal(double grosssal) {
		this.grosssal = grosssal;
	}
	public double getNetsal() {
		return netsal;
	}
	public void setNetsal(double netsal) {
		this.netsal = netsal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", ta=" + ta + ", da=" + da
				+ ", hra=" + hra + ", pf=" + pf + ", grosssal=" + grosssal + ", netsal=" + netsal + "]";
	}
	
	

}
