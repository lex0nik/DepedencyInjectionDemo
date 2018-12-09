package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
		//define a private field for the dependency
		
		private FortuneService fortuneService;
		
		//define a constructor for the dependancy injection
		public BaseballCoach() {
			 ;
		}
		
		public BaseballCoach(FortuneService thefortuneService) {
			this.fortuneService = thefortuneService ;
		}
		
		public String Tartas() {
			return "TARTAROS";
		}
		@Override
		public String getDailyWorkout() {
			return "treksimataki 30 min";
		}

		
		public String getDailyFortune() {

			return fortuneService.getFortune();
		}
}
