import java.util.Scanner;

public class Tribonacci {

	public static void main(String[] args) {
		System.out.println("The Nth term in the sequence is " + tribonacci());
	}
	
	public static int userInput() {
		while(true) {
			try {
				Scanner input = new Scanner(System.in); 
				System.out.println("Enter the value of n: ");
				int n = input.nextInt()  + 1;
				input.close();
				return n;
			}
			catch(Exception e) {
				System.out.println("Invalid input: Please enter an integer input.\n");
			}
		}
	}

	public static int tribonacci() {
		// Initialize the first three sequence values
		int a = 0;
		int b = 1;
		int c = 1;
		int n = userInput();
		switch(n) {
			// Return the 0th element of the sequence for input=0
			case 1: {
				return 0;
			}
			 // The next two elements of the sequence are both 1, so return 1 for input=1 and input=2
			case 2: 
			case 3: {
				return 1;
			}
			// Default we use the equation Tn = Tn-1 + Tn-2 + Tn-3
			default: {
				// Intiliaze the fourth value so it can be returned outside the for loop
				int d = 0;
				for(int i = 0; i < n - 3; i++) {
					d = a + b + c;
					a = b;
					b = c; 
					c = d; 
				}
				return d;
			}
		}
	}
}
