package com.cg.iter.Spring1;

public class Employee
{
	private int EmployeeId;
	private String EmployeeName;
	private int Salary;
	private String BusinessUnit;
	private int Age;
	
	public Employee() 
	{
		
	}

	public Employee(int employeeId, String employeeName, int salary, String businessUnit, int age)
	{

		EmployeeId = employeeId;
		EmployeeName = employeeName;
		Salary = salary;
		BusinessUnit = businessUnit;
		Age = age;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getBusinessUnit() {
		return BusinessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		BusinessUnit = businessUnit;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	
	
	
	

}
