package org.lemontree.csv;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Handler;

public class bar {

    @Handler
    public Map doSomething() {
    	Map<String, Object> body = new HashMap<String, Object>();
    	body.put("foo", "abc");
    	body.put("bar", 123);
		return body;
    }
}