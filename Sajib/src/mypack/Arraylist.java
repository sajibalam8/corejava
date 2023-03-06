package mypack;

import java.util.*;  
class Arraylist{  
   public static void main(String args[]){  
      ArrayList<String> arrList=new ArrayList<String>();  
      arrList.add("Steve");
      arrList.add("Tim");
      arrList.add("Lucy");
      arrList.add("Pat");
      arrList.add("Angela");
      arrList.add("Tom");
  
      //displaying elements
      System.out.println(arrList);
  
      //Adding "Steve" at the fourth position
      arrList.add(3, "Steve");
  
      //displaying elements
      System.out.println(arrList);
   }  
}