package main;

import Configuration.Config;
import Models.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainHandler {
    public static void main(String[] args) {
        ApplicationContext cntx = new AnnotationConfigApplicationContext(Config.class);
        Person p = cntx.getBean(Person.class);
        System.out.println("Name : " + p.getName());
    }
}
