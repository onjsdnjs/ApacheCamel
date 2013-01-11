package org.lemontree.timer;

import org.apache.camel.Handler;

public class bar {

    @Handler
    public String doSomething(String body) {
    	System.out.println("Hello Kiran");
      return "Bye World "+body;
    }
}