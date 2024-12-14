package Oops;
import java.util.Scanner;
class expanse {
	int income;
	int expenses;
	
	public void disp() {
		//System.out.print("invalid input");
		int c = income-expenses;
		System.out.print("The Reamining Amount is: " +c);
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	expanse m = new expanse();
	while(true) 
	{
		try {
			m.income = in.nextInt();
			m.expenses = in.nextInt();
			m.disp();
			break;
		}
		
		catch (Exception e)
		{
			System.out.println("Invalid input");
			break;
		}
	}
	}
}
