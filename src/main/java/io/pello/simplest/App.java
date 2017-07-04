package io.pello.simplest;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Injector injector = Guice.createInjector(new SimplestModule());

        System.out.println( "Hello World!" );
        
        // 1. One way, uses default constructor
        // Driver driver = injector.getInstance(Driver.class);
        
        // 2. Second way, inject later
        Driver driver = new Driver("Bender", 666);
        injector.injectMembers(driver);
        
        System.out.println(driver);
    }
}
