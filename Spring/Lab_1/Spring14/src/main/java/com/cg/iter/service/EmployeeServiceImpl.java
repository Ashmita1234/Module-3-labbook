package com.cg.iter.service;

import com.cg.iter.bean.Employee;
import com.cg.iter.dao.EmployeeDao;
import com.cg.iter.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao eDao;
	public Employee findById(int employeeId)
	{
		eDao=new EmployeeDaoImpl(); 
		return eDao.findById(employeeId);
	}
}
