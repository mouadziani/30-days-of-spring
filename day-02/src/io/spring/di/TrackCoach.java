package io.spring.di;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    // Inject fortune service using setter
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune() + " Using setter injector";
    }

}
