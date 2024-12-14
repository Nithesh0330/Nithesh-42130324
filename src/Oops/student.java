package Oops;
import java.util.Scanner;
class student {
	String name;
	int rollnumber;
	String dep;
   public void disp() {
	   System.out.println(name+ "\n" + rollnumber+ "\n" +dep);
	   
   }
	public static void main(String[] args) {
		student m = new student();
		m.name= "nithesh";
		m.rollnumber=324;
		m.dep="ece";
		m.disp();
	}

}
