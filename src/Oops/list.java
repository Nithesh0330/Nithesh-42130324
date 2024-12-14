package Oops;
import java.util.Scanner;
class list {
	int price ;
	int numofitems;
	
	public void disp() {
		
		int c = price/numofitems;
		System.out.print(c);
	
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		list m = new list();
		
			try {
			m.price=in.nextInt();
			m.numofitems=in.nextInt();
			
			m.disp();
			
			}
			catch (Exception e)
			{
				System.out.print("invalid input");
			}
	}
}



