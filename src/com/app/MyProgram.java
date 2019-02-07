package com.app;

public class MyProgram 
{
    public static void throwit() 
    {
        throw new RuntimeException();
        
        
    }
    public static void main(String args[])
    {
        try 
        {
            System.out.println("Hello world ");
              
            throwit();
            System.out.println("Done with try block ");
        }catch(Exception e){
        	System.err.print(" Runtime exception");
        }
        	
        finally 
        {
            System.out.println("Finally executing ");
        }
    }
}