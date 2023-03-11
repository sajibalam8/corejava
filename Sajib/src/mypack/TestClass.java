package mypack;

import java.util.ArrayList;

public class TestClass extends Test   
{  
    public static void main (String args[])  
    
    {  
    	
    	CustomerType customerType= CustomerType.Default;
    	
    	ArrayList<Student> student= new ArrayList();
    	//student.add("Sam");
    	//student.add(8);
    	student.add(new Student("123","John","JavaIntst"));
    	
    	
    	for (Student s: student)
    	{
    		System.out.println("Arraylist looping--------------" +s);
    	}
    	
    	for ( int i=0 ; i< student.size(); i++) {
    		
    		System.out.println("Arraylist looping using 4 loop--------------" +student.get(i));
    	}
    		///First is object type which is student second is variable and then third is arralist or collection
    		
    		
    	System.out.println("Student=============="+student);
    	
    	System.out.println("Student=============="+student.get(0));
    	/*
      // Teacher teacher = new Teacher(3000, "John Smith");

      // Person1 person1 =  new Teacher(3000, "John Smith");
    
      //S Teacher ch = (Teacher) person1;
       char a ='a';
       int b =3;
       int c= (int) a;
       System.out.println("c---------------"+c);
       System.out.println("a---------------------"+a);
       
       // primitive type int boolean long char double float
       ///object type  	Integer, Boolean, Long, Character, Double, Float
        int value=8;
        int value2= value;
        System.out.println("value---------------------"+value);
        Integer box =Integer.valueOf(value);
        int boxvalue= box.intValue();
        System.out.println("boxvalue---------------------"+boxvalue);
        
        Integer box2=box;
        System.out.println("box---------------------"+box);
        
        long cas =2;//64bytes
     //   int das=cas;// 32 bytes
        /*
        
        byte	8 (1 byte)
        char	16 (2 bytes)
        short	16(2 bytes)
        int	    32 (4 bytes)
        long	64 (8 bytes)
        float	32 (4 bytes)
        double	64 (8 bytes
        		
        		
        		*//////
        
        /*
       // Integer int =new Integer();
        //int convert to long and long convert to int hierarchy
        long cdd =8;
        
        int eee= 8;
        double fff= eee;
        
        double ggg= 8.0;
      //  int hhh= ggg; example of water
        int d= (int)cdd;
        
        
        
        */
       
       
    
       
    }  
}  