package org.lemontree.quartz;

import org.apache.camel.Handler;

public class bar {

    @Handler
    public String doSomething(String body) {
      return "Bye World "+body;
    }
}