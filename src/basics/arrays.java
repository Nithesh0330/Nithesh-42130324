package basics;

public class arrays {
	public static void main(String[] args) {
		
		//datatype[] varible = new datatype[size];
		
		int[] arr1 = new int[5];
		
		int[] arr2= {1, 2, 3, 4, 5};
		
		//System.out.print(arr1[1]);
		
		//to print normal
		//for(int a: arr2) {
			//System.out.print(a+" ");
		//}
		
		// to print in reverse
		for(int i=arr2.length-1;i>=0;i--)
		{
			System.out.print(arr2[i] + " ");
		}
		
	}

}
