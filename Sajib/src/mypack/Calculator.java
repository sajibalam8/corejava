package mypack;

public class Calculator {
	
	
	public static int  calculator (int a, int b, char c) {
		
		switch (c) {
		
		case '+':
			
			return a+b;
			
	    case '-':
			
			return a-b;
			
	    case '*':
			
			return a*b;
			
	    case '/':
			
			return a/b;
		
		default:
			System.out.println("Invalid input");
			
			
	
		
		}
		return 0;
	}
	

}
