package com.app;

public class DuplicateElemnetsLogic {
	public static void main(String[] args) {
		 String names[]={"java","c","c++","c","java","spring","java"};
		 String temp="";
		 for(int i=0;i<=names.length-1;i++){

			   for(int j=i+1;j<=names.length-1;j++){
				   if(names[i].equals(names[j])){
	   temp=temp+" "+names[i];
	}}}
		 System.out.println("---------");
		   System.out.println(temp);
		   
	}
	}


