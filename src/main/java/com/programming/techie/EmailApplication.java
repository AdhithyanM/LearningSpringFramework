package com.programming.techie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {
//        EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);

        emailClient.sendEmail("Hey, " +
                "This is my first email message.");
        emailClient.sendEmail("Hey, " +
                "This is my second email message.");
    }
}
