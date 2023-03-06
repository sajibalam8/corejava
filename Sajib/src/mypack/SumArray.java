package mypack;

public class SumArray {
public static void main(String[] args) {      
int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int sum = 0;

for (int i : my_array)
    sum = sum+i;
for (int i = 1; i <= 2; i++) {
	  System.out.println("Outer: " + i); // Executes 2 times
	  
	  // Inner loop
	  for (int j = 1; j <= 3; j++) {
	    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
	  }
	}


System.out.println("The sum is " + sum);
}
}

