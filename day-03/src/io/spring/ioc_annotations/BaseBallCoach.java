package io.spring.ioc_annotations;

import org.springframework.stereotype.Component;

@Component("optionalCoach")
public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practices ";
    }
}
