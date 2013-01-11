package org.lemontree.objectjson;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

    	 from("stream:in?promptMessage=Enter your age: ")
         .bean(bar.class, "doSomething(*)")
         .marshal().json()
         .to("stream:out");
    }

}
