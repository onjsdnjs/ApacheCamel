package org.lemontree.objectjson;

import org.apache.camel.Handler;

public class bar {

    @Handler
    public Object doSomething(int age) {
      return new Employee(age);
    }
}