package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
		private FortuneService fortuneService;
		private String emailAddress;
		private String team;
		
		
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
			System.out.println("Setting mail...");
		}

		public void setTeam(String team) {
			this.team = team;
			System.out.println("setting team...");
		}

		public FortuneService getFortuneService() {
			return fortuneService;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public String getTeam() {
			return team;
		}

		public CricketCoach() {
			super();
			System.out.println("Inside default consttractor");
		}
		
	public CricketCoach(FortuneService fortuneService) {
			super();
			this.fortuneService = fortuneService;
			System.out.println("inside 1 args constr");
		}

	public void setFortuneService(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
			System.out.println("inside setter");
		}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast cricketing";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "lel " +fortuneService.getFortune();
	}

	@Override
	public String toString() {
		return "CricketCoach [fortuneService=" + fortuneService + ", emailAddress=" + emailAddress + ", team=" + team
				+ "]";
	}

}
