package Function;

public class recurtion {
     public static void main(String[] args)   {
    	 naturalnum(10);
     }
     
     public static void naturalnum(int n) {
    	 if(n==1) {
    		 System.out.print(1);
    	 }
    	 else {
    		 System.out.println(n);
    		 naturalnum(n-1);
    	 }
    	 
     }

}
