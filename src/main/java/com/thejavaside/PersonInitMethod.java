package com.thejavaside;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jgao on 2/24/16.
 */
public class PersonInitMethod {

    public PersonInitMethod() {
        System.out.println("creating bean PersonInitMethod: " + this);
    }

    public void init() {
        System.out.println("init method is called");
    }

}
