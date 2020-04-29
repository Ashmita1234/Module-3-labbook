package com.cg.iter.dao;

import java.util.List;

import com.cg.iter.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{

	private static List<Employee> emplist;
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
		System.out.println(this.emplist);
	}
	public Employee findById(int employeeId) {
		for(Employee data:emplist){
			if(data.getEmployeeId()==employeeId)
				return data;
		}
		return null;
	}

}
