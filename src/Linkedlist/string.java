package Linkedlist;
import java.util.*;

public class string {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = "21XYG34FE";
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			int a=0;
		
			while (Character.isDigit(c))
			{
				a=(a*10)+(c-'0');
				i++;
				c=s.charAt(i);
			}
			sum+=a;
		}
		System.out.print(sum);
	}
}
