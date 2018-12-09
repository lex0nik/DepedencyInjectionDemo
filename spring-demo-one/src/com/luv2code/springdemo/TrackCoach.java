package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Trexte re paloukaria";
	}

	
	public String getDailyFortune() {
		
		return "Xalarosame..." + fortuneService.getFortune();
	}

}
