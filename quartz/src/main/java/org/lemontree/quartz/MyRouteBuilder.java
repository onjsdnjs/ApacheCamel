package org.lemontree.quartz;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

    	from("quartz://kirantimer?trigger.repeatInterval=1000&trigger.repeatCount=10")
        .bean(bar.class, "doSomething(*)")
        .to("stream:out");
    }

}
