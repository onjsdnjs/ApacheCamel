package org.lemontree.sql;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

    	from("stream:in?promptMessage=Enter your name: ")
        .to("sql:select * from \"Employee\" where name = # ?dataSourceRef=testdb")
        .to("stream:out");
    }

}
