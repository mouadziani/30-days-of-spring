package io.spring.di_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mainCoach")
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune() + " From mainCoach bean";
    }

}
