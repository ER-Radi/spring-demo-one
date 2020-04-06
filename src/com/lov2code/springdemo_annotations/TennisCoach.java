package com.lov2code.springdemo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope("singleton")
public class TennisCoach implements Coach {

    /*
     * Field Injection is done by using Java Reflection.
     * Qualifier: Tell Spring with Bean ID to use for the injection,
     *            Can be applied to: Constructor injection, Setter injection methods, Field injection
     */
    @Autowired
    @Qualifier("randomFortuneService")
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
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
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

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuffYoYo() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }
}
