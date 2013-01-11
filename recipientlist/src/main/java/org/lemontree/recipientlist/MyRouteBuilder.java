package org.lemontree.recipientlist;

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
                   .multicast().to("direct:b", "direct:c");
        
        from("direct:b").to("file:src/file1");
        from("direct:c").to("file:src/file2");
    }

}
