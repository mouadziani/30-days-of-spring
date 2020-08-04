package io.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach mainCoach = context.getBean("mainCoach", Coach.class);
        System.out.println(mainCoach.getDailyFortune());

        Coach optionalCoach = context.getBean("optionalCoach", Coach.class);
        System.out.println(optionalCoach.getDailyFortune());

        context.close();
    }
}
