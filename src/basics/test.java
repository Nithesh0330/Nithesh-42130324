package basics;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numItems = in.nextInt();
        int target = in.nextInt();
        
        int[] salesRates = new int[numItems];
        for (int i = 0; i < numItems; i++) {
            salesRates[i] = in.nextInt();
        }
        
        for (int i = 0; i < numItems; i++) {
            for (int j = i + 1; j < numItems; j++) {
                if (salesRates[i] + salesRates[j] == target) {
                    System.out.println(i + " " + j);
                    in.close();
                    return;
                }
            }
        }
        
        System.out.println("-1");
        in.close();
    }
}


