import java.util.*;

public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //taString name = sc.next();
        // Try both!!!

        String name = sc.nextLine();       // for string value
        int x = sc.nextInt();              // for integer value
        float y = sc.nextFloat();          // for float value

        System.out.println(name);
        System.out.println(x);
        System.out.println(y);

        // Task input a and b and print their sum
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
    
}
