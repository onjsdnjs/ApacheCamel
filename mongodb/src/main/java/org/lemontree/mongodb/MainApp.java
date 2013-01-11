package org.lemontree.mongodb;

import org.apache.camel.main.Main;
import org.lemontree.mongodb.Mongo;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.enableHangupSupport();
        main.bind("mydb", new com.mongodb.Mongo());
        main.addRouteBuilder(new MyRouteBuilder());
        main.run(args);
    }

}

