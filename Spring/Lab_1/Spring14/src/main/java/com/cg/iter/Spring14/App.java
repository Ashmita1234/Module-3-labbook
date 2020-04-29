package com.cg.iter.Spring14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.iter.bean.Employee;
import com.cg.iter.dao.EmployeeDaoImpl;
import com.cg.iter.service.EmployeeService;
import com.cg.iter.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cxt=new ClassPathXmlApplicationContext("employee.xml");
    	EmployeeDaoImpl sbu=(EmployeeDaoImpl) cxt.getBean("emp");
    	System.out.println("Enter Employee Id : ");
    	Scanner s=new Scanner(System.in);
    	int empId=s.nextInt();
    	EmployeeService empService=new EmployeeServiceImpl();
    	Employee emp=empService.findById(empId);
    	if(emp==null)
    	{
    		System.out.println("No Employee Exist");
    	}
    	else
    	{
    		System.out.println("Employee Id: "+emp.getEmployeeId());
    		System.out.println("Employee Name: "+emp.getEmployeeName());
    		System.out.println("Employee Salary: "+emp.getSalary());
    	}
    }
}
