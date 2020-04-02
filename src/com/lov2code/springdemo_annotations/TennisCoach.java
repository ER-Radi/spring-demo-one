package com.lov2code.springdemo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

    /*
     * Field Injection is done by using Java Reflection
     */
    @Autowired
    private FortuneService fortuneService;

    // define a default constructor

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    /*
     *   As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
     *   no longer necessary if the target bean defines only one constructor to begin with.
     *   However, if several constructors are available, at least one must be annotated
     *   with @Autowired in order to instruct the container which one to use.
     */
    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    */


    // define a setter method
    /*
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        fortuneService = theFortuneService;
    }
    */

    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService = theFortuneService;
    }
    */


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
