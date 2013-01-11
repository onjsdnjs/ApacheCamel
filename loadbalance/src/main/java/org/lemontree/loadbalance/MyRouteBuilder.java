package org.lemontree.loadbalance;

import java.io.IOException;

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
        from("file:src/data?noop=true")
            .loadBalance().roundRobin()
                .to("direct:x", "direct:y", "direct:z");
        
        from("direct:x").to("file:src/file1");
        from("direct:y").to("file:src/file2");
        from("direct:z").to("file:src/file3");
    }

}
