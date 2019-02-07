class B

{ 
    B()
    {
    	super();
        System.out.print("super");
    }
} 
public class A extends B
{ 
	A(){
	System.out.println("Base");
		}
    public static void main(String[] args)
    { 
        new A(); /* Line 12 */
        new B(); /* Line 13 */
    } 
}
   


