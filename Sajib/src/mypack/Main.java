package mypack;

public class Main   
{  
    public static void main (String args[])   
    {  
    	OverloadedConstructors test1 = new OverloadedConstructors(10);  
    	OverloadedConstructors test2 = new OverloadedConstructors(12, 15);  
        System.out.println(test1.i);  
        System.out.println(test2.i);  
    }  
}  