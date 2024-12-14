package basics;

import java.util.Scanner;

public class fibonaci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter n");
		int n = in.nextInt();
		int first = 0;
		int second = 1;
		int c = 0;
		
		for(int i = 3;i<=n;i++) {
			c=first+second;
			first = second;
			second = c;
		
		}
        System.out.print(+c);
	}
	
	
}
