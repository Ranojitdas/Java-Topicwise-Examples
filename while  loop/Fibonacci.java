import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        fibonacci(n);


    }
    public static void fibonacci(int n){
        int a=0,b=1,c,i=1;
        System.out.println( " "+ a + " ");
        System.out.println( b + " ");
        while(i<=n){
            c = a +b;
            System.out.println(c);
            a = b;
            b = c;
            i++;

        }
    }
}
