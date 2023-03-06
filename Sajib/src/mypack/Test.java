package mypack;

public class Test   
{  
    public static void main (String args[])   
    {  
        System.out.println(10 * 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 + 20);  
        SuperContructor e = new SuperContructor(22, "Mukesh", "Delhi", 90000);  
        System.out.println("Name: "+e.name+" Salary: "+e.salary+" Age: "+e.age+" Address: "+e.address);  
    }  

}

 
