package com.lov2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;


    // create a co-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
