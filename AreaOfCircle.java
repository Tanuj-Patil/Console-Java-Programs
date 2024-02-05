import java.util.*;

class AreaOfCircle {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of Circle: ");
		
		double rad = input.nextDouble();
		double area = 3.14*rad*rad;
		System.out.println("The Area of Circle is: " +area);
	}
}