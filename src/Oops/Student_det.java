package Oops;
import java.util.Scanner;
class Student_det {
	String name;
	int rollnum;
	String dep;
	
	public void disp() {
		System.out.println(name);
		System.out.println(rollnum);
		System.out.println(dep);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student_det m = new Student_det();
		m.name=in.next();
		m.rollnum=in.nextInt();
		m.dep=in.next();
		m.disp();
	}

}
