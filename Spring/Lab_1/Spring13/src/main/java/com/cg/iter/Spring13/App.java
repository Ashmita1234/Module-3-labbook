package com.cg.iter.Spring13;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.iter.bean.Employee;
import com.cg.iter.bean.SBU;

/**
 * Hello world!
 *
 */
public class App 
{
    	public static void main(String[] args) {
    		ApplicationContext cxt=new ClassPathXmlApplicationContext("employee.xml");
    		SBU sbunit=(SBU) cxt.getBean("sbu");
    		System.out.println("SBU Details");
    		System.out.println("----------------------------");
    		
    		//System.out.println(sbunit);
    		
    		System.out.println("sbuCode="+sbunit.getSbuCode()+", sbuHead="+sbunit.getSbuHead()+", sbuName="+sbunit.getSbuName());
    		System.out.println("Employee Details:----------------");
    		System.out.print("[");
    		List<Employee> emp=sbunit.getEmpList();
    		for(Employee data:emp){
    			System.out.print("\nEmployee [");
    			System.out.print("empId="+data.getEmployeeId()+", ");
    			System.out.print("empName="+data.getEmployeeName()+", ");
    			System.out.print("empSalary="+data.getSalary()+"]");
    		
    		}
    		System.out.println("\n]");
    	}
}
