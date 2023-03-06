package mypack;

public class Constructor{  
int id;  
String name;  
  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
Constructor s1=new Constructor();  
Constructor s2=new Constructor();  
s1.display();  
s2.display();  
}  
}  