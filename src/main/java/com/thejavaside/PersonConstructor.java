package com.thejavaside;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by jgao on 3/4/16.
 */
@Component
public class PersonConstructor {
    public PersonConstructor () {
        System.out.println("PersonConstructor is created");
    }

    @PostConstruct
    public void postConstructorMethod() {
        System.out.println("Post Constructor Method is called");
    }
}
