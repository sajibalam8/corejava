package mypack;

public class OverloadedConstructors 
{  
    int i;   
    public OverloadedConstructors(int k)  
    {  
        i=k;  
    }  
    public OverloadedConstructors(int k, int m)  
    {  
        System.out.println("Hi I am assigning the value max(k, m) to i");  
        if(k>m)  
        {  
            i=k;   
        }  
        else   
        {  
            i=m;  
        }  
    }  
}  

