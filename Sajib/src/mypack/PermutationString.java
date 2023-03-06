package mypack;

import java.util.*;
public class PermutationString {

 public static void main(String[] args) {
  permutationWithRepeation("PQR");

 }

 private static void permutationWithRepeation(String str1) {
  System.out.println("The given string is: PQR");
  System.out.println("The permuted strings are:");
  showPermutation(str1, "");
 }

 private static void showPermutation(String str1, String NewStringToPrint) {

  if (NewStringToPrint.length() == str1.length()) {
   System.out.println(NewStringToPrint);
   return;
  }
  for (int i = 0; i < str1.length(); i++) {

   showPermutation(str1, NewStringToPrint + str1.charAt(i));
  }
 }
}