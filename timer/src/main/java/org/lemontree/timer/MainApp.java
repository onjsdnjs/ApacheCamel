package org.lemontree.timer;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.Main;
import org.apache.camel.util.jndi.JndiContext;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
	
	
    public static void main(String... args) throws Exception {
    	//JndiContext context = new JndiContext();
    	//context.bind("bye", new bar());
    //	CamelContext camelContext = new DefaultCamelContext(context);
    	 Main main = new Main();
       main.enableHangupSupport();
    main.bind("bye", new bar());
    //    camelContext.addRoutes(new MyRouteBuilder());
       main.addRouteBuilder(new MyRouteBuilder());
        main.run(args);
        
    }

}

