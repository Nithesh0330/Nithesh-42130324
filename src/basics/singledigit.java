package basics;
import java.util.Scanner;
public class singledigit {
	 public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    System.out.print("enter a number");
		    int n = in.nextInt();
		    int sum=0;
		    while(n>9) 
		    {
		    while(n!=0)
		      
		    {
		      int a = n%10;
		      sum=sum+a;
		      n=n/10;
		    }
		      n=sum;
		      sum=0;
		    }
		    System.out.print(+n);
		  }

		}


