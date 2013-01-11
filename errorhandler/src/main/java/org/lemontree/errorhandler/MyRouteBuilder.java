package org.lemontree.errorhandler;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

    	errorHandler(deadLetterChannel("direct:a")
    		    .maximumRedeliveries(3).redeliveryDelay(5000));
    	
    	  from("file:src/data?delete=true")         
          .to("direct:b");
    	  
          from("direct:a").to("file:src/file1");
    }

}
