package com.cg.iter.Spring12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.iter.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("employee.xml");
        Employee em=(Employee) ctx.getBean("emp");
        System.out.println("Employee Details");
        System.out.println("--------------------------------------------------------");
        System.out.println(em);
    }
}
