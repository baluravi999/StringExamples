package com.app;

public class StringToChar {

	public static void main(String[] args) {
		String s="balaji";
		char[] ch=s.toCharArray();
		int i=ch.length;//6
		
		for(char c:ch){
			System.out.print(c+" "); //b a l a j i 
		}
		

	}

}
