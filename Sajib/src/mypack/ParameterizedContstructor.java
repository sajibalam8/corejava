package mypack;


public class ParameterizedContstructor   
{  
	ParameterizedContstructor(int a, int b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    ParameterizedContstructor(int a, float b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    public static void main (String args[])  
    {  
        byte a = 10;   
        byte b = 15;  
        ParameterizedContstructor test = new ParameterizedContstructor(a,b);  
    }  
}  