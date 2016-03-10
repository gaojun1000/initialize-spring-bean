package com.thejavaside;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jgao on 2/24/16.
 */
public class TestAppContext {
    @Test
    public void testContextAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    }

}
