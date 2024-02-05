import java.util.Scanner;

class LastProgram {

	static Scanner obj = new Scanner(System.in);
	static int roll;
	static String name;
	static double fees;
	
	static void input() {
		System.out.println("Enter Roll No: ");
		roll = obj.nextInt();
		System.out.println();
		name = obj.next();
		System.out.println();
		fees = obj.nextDouble();
	}
	static void display() {
		System.out.println("Your Roll No is:" +roll);
		System.out.println("Your Name is: " +name);
		System.out.println("Your Fees is:" +fees);
	}
	public static void main(String args[]) {
		input();
		display();
	}
}