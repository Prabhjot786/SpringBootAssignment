package com.cp.project.spring.LabExercise;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Employee employee=(Employee) context.getBean("employee");
		System.out.println("Employee Details");
		System.out.println("------------------");

		employee.getEmployeeId();
		employee.getEmployeeName();
		employee.getSalary();
		//employee.getBusinessUnit();
		employee.getAge();
		
		System.out.println("\n SBU Details");
		System.out.println("------------------");

		System.out.println(employee.toString());
	    System.out.println("\n Employee Details :-");
		employee.Data();
		
		System.out.println("\n Enter Employee Id:");
		Scanner sc=new Scanner(System.in);
		
		
		
		int id=sc.nextInt();
		System.out.println("Employee Info:");
		if(id==employee.getEmployeeId())
		{
			employee.getEmployeeName();
			employee.getAge();
		}
		 
	}
}
