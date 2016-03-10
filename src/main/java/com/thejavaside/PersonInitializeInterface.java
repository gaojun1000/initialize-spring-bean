package com.thejavaside;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by jgao on 3/4/16.
 */
@Component
public class PersonInitializeInterface implements InitializingBean {

    public PersonInitializeInterface() {
        System.out.println("bean PersonInitializeInterface is created");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is called");
    }
}
