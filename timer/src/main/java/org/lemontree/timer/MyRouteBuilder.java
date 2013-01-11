package org.lemontree.timer;

import org.apache.camel.builder.RouteBuilder;


/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

	

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {
    	
    	from("timer://foo?fixedRate=true&period=1000")
    	.to("bean:bye?method=doSomething")
    	//.bean(bar.class, "doSomething(*)")
       .to("stream:out");
    }

}
