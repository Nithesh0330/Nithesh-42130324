package basics;

import java.util.Scanner;

public class user_array {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("enter the size of first array");
	    int n1= in.nextInt();
	    
	    int[] arr1 = new int[n1];
	    for(int i=0;i<n1;i++) {
	      arr1[i]=in.nextInt();
	    }
	    System.out.print("enter the size of second array");
	    
	    int n2 = in.nextInt();
	    int [] arr2 = new int[n2];
	    
	    for(int i=0;i<n2;i++) {
	      arr2[i]=in.nextInt();
	    }
	    for(int a: arr1) {
	       System.out.println(a+" ");
			}
	    for(int b: arr2) {
				System.out.println(b+" ");
			}
	  }
	}
	   

