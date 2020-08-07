package io.spring.di_annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyDailyFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "Today is your luky day !";
    }
}
