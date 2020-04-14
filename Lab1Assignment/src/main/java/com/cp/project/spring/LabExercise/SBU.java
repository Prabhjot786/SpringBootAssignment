package com.cp.project.spring.LabExercise;

import java.util.ArrayList;
import java.util.List;

public class SBU {
	
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	static List<Employee> empList=new ArrayList<Employee>();
	
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public void empData()
	{
		for(Employee emp:empList)
		{
			emp.getEmployeeId();
			emp.getEmployeeName();
			emp.getSalary();
			emp.getAge();
			//emp.getBusinessUnit();
		}
	}
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
}
