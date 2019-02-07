


public class Test {
	
	StringBuffer b1=null;
	StringBuffer b2=null;
    
     void start() 
		{
    	 StringBuffer b1 = new StringBuffer("Hello, world");
		StringBuffer b2 = fix(b1);
		if(b1.equals(b2)){
		System.out.println(b1 + " : " + b2);
		}}
     StringBuffer fix(StringBuffer b1) 
     {
     b1.append(" Hey");
     return b1;
     }

     
	public static void main(String[] args) {
		
	
		Test t=new Test();
	     
           t.start();
	    
	}

}
