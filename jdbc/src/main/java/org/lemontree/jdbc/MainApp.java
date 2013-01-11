package org.lemontree.jdbc;

import org.apache.camel.impl.JndiRegistry;
import org.apache.camel.main.Main;
import org.postgresql.ds.PGPoolingDataSource;

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
        PGPoolingDataSource source = new PGPoolingDataSource();
        source.setDataSourceName("A Data Source");
        source.setServerName("localhost");
        source.setDatabaseName("kiran");
        source.setUser("postgres");
        source.setPassword("123456");
        source.setMaxConnections(10);
      //  JndiRegistry reg = new JndiRegistry();
        main.bind("testdb", source);
        main.addRouteBuilder(new MyRouteBuilder());
        main.run(args);
    }

}

