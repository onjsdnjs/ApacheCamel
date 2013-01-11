package org.lemontree.mail;

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
    	
        from("file:src/data?delete=true")
                    .to("smtp://smtp.gmail.com:465?password=Google@1234&username=skirankumars31@gmail.com&subject=from camel");
    }

}
