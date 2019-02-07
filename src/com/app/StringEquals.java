package com.app;

import java.util.Scanner;

public class StringEquals {
public static void main(String[] args) {
	System.out.println("enter one string name");
	String original=new Scanner(System.in).next();
	StringBuffer sb=new StringBuffer(original);
	//System.out.println(sb);
	StringBuffer rev=sb.reverse();
	System.out.println(rev);
	String reverse=rev.toString();
	if(original.equals(reverse))
		System.out.println("equal reverse of the string is "+rev);
		
	
	else
	
		System.out.println("both are not equal");
	
	
}
}
