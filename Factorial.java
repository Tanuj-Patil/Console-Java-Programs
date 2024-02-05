import java.util.*;

class Factorial {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println("Factorial of " + n + " is " + fact(n));
        obj.close(); // Close the Scanner object
    }

    public static int fact(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}