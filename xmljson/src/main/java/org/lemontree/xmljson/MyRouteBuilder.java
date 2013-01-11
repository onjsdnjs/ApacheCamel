package org.lemontree.xmljson;

import java.util.Arrays;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.xmljson.XmlJsonDataFormat;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

    	XmlJsonDataFormat xmlJsonFormat = new XmlJsonDataFormat();
    	xmlJsonFormat.setEncoding("UTF-8");
    	xmlJsonFormat.setForceTopLevelObject(true);
    	xmlJsonFormat.setTrimSpaces(true);
    	xmlJsonFormat.setRootName("newRoot");
    	xmlJsonFormat.setSkipNamespaces(true);
    	xmlJsonFormat.setRemoveNamespacePrefixes(true);
    	xmlJsonFormat.setExpandableProperties(Arrays.asList("d", "e"));
    	
    	from("file:src/data?noop=true")
    	.marshal(xmlJsonFormat)
    	.wireTap("direct:tap")
    	.to("direct:unmarshal");
    	
    	from("direct:unmarshal")
    	.unmarshal(xmlJsonFormat)
    	.wireTap("direct:tap")
    	.to("mock:xml");
    	
    	 from("direct:tap").to("stream:out");
    }

}
