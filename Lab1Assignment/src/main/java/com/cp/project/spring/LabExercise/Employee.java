package com.cp.project.spring.LabExercise;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU businessUnit;
	//private String businessUnit;
	private int age;
	
	public void Data()
	{
		businessUnit.empData();
	}
	
	
	@Autowired
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	

	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public int getEmployeeId() {
		System.out.println("Employee Id: "+employeeId);
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		System.out.println("Employee Name: "+employeeName);

		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		System.out.println("salary: "+salary);
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/*public String getBusinessUnit() {
		System.out.println("Bussiness Unit: "+businessUnit);

		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}*/
	public int getAge() {
		System.out.println("Age: "+age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "sbuId= "+businessUnit.getSbuId()+" "+"sbuName= "+businessUnit.getSbuName()+" "+"sbuHead= "+businessUnit.getSbuHead();	
	}
}
