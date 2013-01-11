package org.lemontree.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.DB;

import java.net.UnknownHostException;
import java.util.Arrays;

import org.apache.camel.Handler;

public class Mongo {

	@Handler
    public DB doSomething(String body) {
		MongoClient mongoClient;
		try {
			 mongoClient = new MongoClient( "localhost" , 27017 );
			 DB db = mongoClient.getDB( "kiran" );
			 return db;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
	
}
