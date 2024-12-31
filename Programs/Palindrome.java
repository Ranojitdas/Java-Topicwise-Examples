import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int reverse = reverse(n);
        if (n == reverse){
            System.out.println("This is a palindrome number");
        }
        else System.out.println("This is not a palindrome number");
    }
    public static int reverse(int n){
        int newN = 0;
        while (n>0){
            int digit = n % 10 ;
            newN = newN * 10 + digit;
            n = n/10;

        }
        return newN;

    }
}
