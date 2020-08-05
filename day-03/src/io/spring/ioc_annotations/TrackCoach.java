package io.spring.ioc_annotations;

import org.springframework.stereotype.Component;

@Component("mainCoach")
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

}
