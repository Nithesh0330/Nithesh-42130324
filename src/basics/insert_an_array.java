package basics;

import java.util.Scanner;

public class insert_an_array {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("enter the size of the array");
	    int n= in.nextInt();
	    
	    int[] arr = new int[n+1];
	    for(int i=0;i<n;i++) {
	      arr[i]=in.nextInt();
	    }
	    System.out.print("enter the position to be inserted");
      int pos = in.nextInt();
      if(pos<=n) 
      {
    	  System.out.print("enter the value to be inserted");
        int value = in.nextInt();
        for(int i=n-1;i>=pos-1;i--)
        {
          arr[i+1]=arr[i];
          if(i==pos-1)
          {
            arr[pos-1] = value;
          }
        }
        System.out.println("Array after insertion is");
      
      
       for(int i=0;i<=n;i++) {
	       System.out.println(arr[i]);
			}
      }
       else {
        System.out.print("Invalid Input");
      }
    }
}
