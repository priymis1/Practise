package com.mycompany._09_2019_spring_demo.bean;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String teamName;

	public String getDailyWorkout() {
		
		return "practise 5k running today "+ getTeamName() +" " +getEmail();
	}
	
	

	public CricketCoach() {
		super();
	}
	
	



	public FortuneService getFortuneService() {
		return fortuneService;
	}



	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
