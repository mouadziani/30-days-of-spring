package io.spring.di;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    // Inject fortune service using constructor
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practices ";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune() + " Using constructor injector";
    }
}
