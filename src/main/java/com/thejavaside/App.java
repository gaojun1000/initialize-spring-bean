package com.thejavaside;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jgao on 2/24/16.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        
    }
}
