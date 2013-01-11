package org.lemontree;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	  private static final Logger LOGGER = Logger.getLogger(App.class);
	  
    public static void main( String[] args )
    {
    	 BasicConfigurator.configure();
         LOGGER.debug("Debug -- Hello World");
         LOGGER.info("Info -- Hello World");
         LOGGER.error("Error -- Hello World");
         LOGGER.fatal("Fatal -- Hello World");
         LOGGER.warn("Warn -- Hello World");
    }
}
