package com.lov2code.springdemo_annotations;

import org.springframework.stereotype.Component;

// the default bean name in this case will be RESTFortuneService not rESTFortuneService
@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
