package io.spring.di_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("optionalCoach")
public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practices ";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune() + " From optionalCoach bean";
    }
}
