package in.oasys;

public class ExceptionProject {
public static void main(String args[]) {
	try {
		int num1=35;
		int num2=0;
		//System.out.println(num1/num2);
	}
	catch (Exception e) {
		e.printStackTrace();
		System.out.println(e);
	}
	System.out.println("Program End");
}
}
