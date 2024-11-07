import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        long fact = factorial(n);
        System.out.println("The Factorial is " + fact);
    }
    public static long factorial(int n){
        int i = 1;
        int f = 1;
        while (i<=n){
            f = f*i;
            i++;
        }
        return f;
    }
}
