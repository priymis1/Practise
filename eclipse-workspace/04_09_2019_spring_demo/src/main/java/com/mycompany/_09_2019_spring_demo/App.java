package com.mycompany._09_2019_spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany._09_2019_spring_demo.bean.BaseballCoach;
import com.mycompany._09_2019_spring_demo.bean.Coach;
import com.mycompany._09_2019_spring_demo.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	
    	try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			//1
			//Coach myCoach = context.getBean("theCoach", BaseballCoach.class);
			//System.out.println(myCoach.getDailyWorkout());
			//Coach myCoach1 = context.getBean("theCoach", BaseballCoach.class);
			//System.out.println(myCoach==myCoach1);
			
			//2
			//Employee employee = context.getBean("theEmployee", Employee.class);
			//System.out.println(employee);
			
			//3 updated coach class  
			Coach theCoach=context.getBean("theCoach",Coach.class);
        	System.out.println(theCoach.getDailyWorkout()+" "+theCoach.getDailyFortune());
    		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
       
    }
}
