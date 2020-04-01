package com.lov2code.springdemo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionDemoApp {

    public static void main(String[] args) {

        // read the spring config file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("resources/springdemo_annotations/applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
