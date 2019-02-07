package com.app;

public class StringA {

  
static  String str1=new String("kishore");

  public static void main(String args[]){
	 String s1="10";
	 String s2="20";
	 s1.concat(s2);
	 System.out.println("original object"+" "+s1);
	String s3= s1.concat(s2);
	 System.out.println("new object"+" "+s3);
	 StringBuffer sb1=new StringBuffer("10");
	 StringBuffer sb2=new StringBuffer("20");
	 sb1.append(sb2);
	 System.out.println("original object"+" "+sb1);
	 StringBuffer sb3=sb1.append(sb2);
	 System.out.println("new object"+" "+sb3);
  }

private void concate(String s22) {
	// TODO Auto-generated method stub
	
}
  
}
