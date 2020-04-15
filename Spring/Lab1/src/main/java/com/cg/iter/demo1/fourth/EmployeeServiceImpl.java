package com.cg.iter.demo1.fourth;

public class EmployeeServiceImpl implements EmployeeService{

	public Employee getDetails(int empId) {
		EmployeeDAO emp=new EmployeeDAO();
		return emp.getDetails(empId);
	}
 
}
