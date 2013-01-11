package org.lemontree.validation;

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
            .doTry()
               .to("validator:file:src/main/resources/schema.xsd")
               .to("file:src/output")
            .doCatch(IOException.class)
             .to("stream:out")
              .end();
    }

}
