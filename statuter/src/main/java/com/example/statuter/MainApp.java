package com.example.statuter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration from beans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the Student bean from the Spring context
        Student student = (Student) context.getBean("studentBean");

        // Print student details
        System.out.println(student);
    }
}
