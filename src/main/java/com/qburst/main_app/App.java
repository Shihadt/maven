package com.qburst.main_app;


import com.qburst.my_app.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyApp myApp = new MyApp();
    	myApp.someFunction();
    	System.out.println("Again hii..");
    }
    public static String getData() {
    	return "success";
    }
}
