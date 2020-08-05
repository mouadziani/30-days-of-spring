package io.spring.ioc_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach mainCoach = context.getBean("mainCoach", Coach.class);
        System.out.println(mainCoach.getDailyWorkout());

        Coach optionalCoach = context.getBean("optionalCoach", Coach.class);
        System.out.println(optionalCoach.getDailyWorkout());

        context.close();
    }
}
