package com.lov2code.springdemo_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.lov2code.springdemo_annotations")
@PropertySource("classpath:resources/springdemo_annotations/sport.properties")
public class SportConfig {

    // define bean for our sad fortune service
    // # Method name will be the "bean id"
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
