package org.lemontree.zip;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message using XPath
    	 from("stream:in?promptMessage=Enter your name: ")
            .marshal()
            .zip()
            .wireTap("direct:tap")
            .to("file:target/messages/others")
            .unmarshal()
            .zip()
            .to("stream:out");
    	 
    	 from("direct:tap").to("stream:out");
    }

}
