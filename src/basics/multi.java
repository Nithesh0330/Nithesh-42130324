package basics;

import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n");
        int n = in.nextInt();
        
        for(int i =1;i<11;i++)
        {
            int m = n*i;
            System.out.println(+n+"*"+i+"="+m);
        }
      
    }
}