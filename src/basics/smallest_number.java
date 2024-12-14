package basics;
import java.util.Scanner;
public class smallest_number {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        // Input three numbers
	        System.out.print("Enter the first number: ");
	        int num1 = in.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = in.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = in.nextInt();

	        // Find the smallest number using simple comparisons
	        int smallest = num1;

	        if (num2 < smallest) {
	            smallest = num2;
	        }
	        if (num3 < smallest) {
	            smallest = num3;
	        }

	        // Output the smallest number
	        System.out.println("The smallest number is: " + smallest);

	      
	    
	}

}
