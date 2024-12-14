package basics;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		String name = in.next();
		int number = in.nextInt();
		String dep = in.next();
		
		System.out.println(name + "\n" + number+ "\n" +dep );

	}	

}

