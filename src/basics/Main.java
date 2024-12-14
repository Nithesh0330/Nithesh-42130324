package basics;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("enter number to be reversed");
    int n = in.nextInt();
    int sum=0;
    while(n!=0)
    {
      int a = n%10;
      sum= sum*10+a;
      n= n/10;
    }
    System.out.print(+sum);
  }
}
