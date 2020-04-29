package com.cg.iter.bean;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private int age;
	private SBU businessUnit;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(int employeeId, String employeeName, double salary, int age, SBU businessUnit) {
		//System.out.println("param constr");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
		this.businessUnit = businessUnit;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public SBU getBusinessUnit() {
		return businessUnit;
	}



	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", age="
				+ age + ", businessUnit=" + businessUnit + "]";
	}
	
	
	
	
	

}
