package com.mycompany._09_2019_spring_demo.bean;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	public String getDailyWorkout() {
		
		return "practise 5k running today";
	}
	
	

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}



	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortuneService();
	}

}
