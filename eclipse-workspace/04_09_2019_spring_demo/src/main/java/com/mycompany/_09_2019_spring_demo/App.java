package com.mycompany._09_2019_spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany._09_2019_spring_demo.bean.BaseballCoach;
import com.mycompany._09_2019_spring_demo.bean.Coach;

public class App 
{
    public static void main( String[] args )
    {
    	
    	try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach myCoach = context.getBean("theCoach", BaseballCoach.class);
			System.out.println(myCoach.getDailyWorkout());
			Coach myCoach1 = context.getBean("theCoach", BaseballCoach.class);
			System.out.println(myCoach==myCoach1);
    		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
       
    }
}
