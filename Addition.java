public class Addition {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int mult = a * b;
        int diff = b - a;
        int result = mult / diff;
        System.out.println(result);
        //Or
        a = 10;
        b = 5;
        result = (a * b) / (a - b);
        System.out.println(result);
    }   
}