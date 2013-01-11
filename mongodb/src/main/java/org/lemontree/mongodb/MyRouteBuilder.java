package org.lemontree.mongodb;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

    	  from("stream:in")
    	  .to("mongodb:mydb?database=kiran&collection=employee&operation=findAll")
          .to("stream:out");
    }

}
