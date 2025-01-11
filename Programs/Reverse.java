import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int reverse = reverse(n);
        System.out.println("The reverse number is : " + reverse);
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
