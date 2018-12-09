package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		
		BaseballCoach theCoach = (BaseballCoach) context.getBean("myCoach", Coach.class);
		CricketCoach theCoach3 = context.getBean("myCoach3", CricketCoach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach3.getDailyWorkout());
		System.out.println(theCoach3.getDailyFortune());
		System.out.println(theCoach3.getEmailAddress());
		System.out.println(theCoach3.getTeam());
		System.out.println(theCoach3.getClass());
		System.out.println(theCoach3.toString());
		
		
		//System.out.println(theCoach.getDailyFortune());
		
		//close the context	
		
		
		context.close();;
	}

}
