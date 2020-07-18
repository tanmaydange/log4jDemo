package com.dange.tanmay.log4jDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Logger Log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	Log.debug("Inside Main");
    	Log.info("Hello World!");
        int x=10;
        Log.info("Variable value is {}",x);
    }
}
