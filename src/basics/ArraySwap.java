package basics;
import java.util.Scanner;
public class ArraySwap {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] arr = new int[n];
	for(int i = 0;i<n;i++) {
		arr[i] = in.nextInt();
	}
	for(int a: arr) {
		System.out.print(a);
	}
	
	System.out.print(" ");
}
}
