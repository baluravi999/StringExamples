package com.equals;

public  class Test {
   static int a=10;
   Test t=new Test();
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(a);
		//Test t=new Test();
		
		String s1="true";
		
		String s2="true";
		String s3=s2;
		String s4=new String("true");
		Boolean b1=new Boolean("true");
		Boolean b2=new Boolean("true");
		if(s1==s2){
			System.out.println("true-s1");
			
		} if(s3.equals(s2)){
			System.out.println("true-s3");
			
		}else{
			System.out.println("false");
			
		}if(s3==s4){
			System.out.println("true-s4");
		}
		if(!(b1==b2)){
			System.out.println("false-b1");
			
		}if(b1.equals(b2)){
			System.out.println("true-b2");
		}
		String str="rattaiah how r u";   
		System.out.println(str.replace('a','A'));  //rAttAiAh   
		System.out.println(str.replace("how","who"));
    
	}

}
