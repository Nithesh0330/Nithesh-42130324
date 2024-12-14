package basics;

import java.util.Scanner;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.print("enter n");
	 int n = in.nextInt();
	int a = 0;
	
	for(int i=2;i<n;i++) {
		if(n%i==0)
		{
			a=1;
			break;
		}
	}
 	if(a==0) {
 		System.out.println("prime number" +n );
 	}
 	else {
 		System.out.print("not a prime");
 	}
    }
}
