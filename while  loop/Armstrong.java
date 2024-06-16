import java.util.Scanner;

import static java.lang.Math.pow;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        boolean isTrue = isArmstrong(n);
        if (isTrue){
            System.out.println("Your number is armstrong number");
        }
        else System.out.println("Your number is not a armstrong number");
    }
    public static boolean isArmstrong(int n){
            int m,finalNumber=0;
            int nofDigits = noOfDigits(n);
            m = n;
            while (n>0) {
                int lastDigit = n % 10;
                n = n / 10;
                finalNumber = (int) (finalNumber + pow(lastDigit, nofDigits));
            }
            return finalNumber == m;
    }
    public static int noOfDigits(int n ){
        int digits = 0;
        while (n>0){
            digits++;
            n = n/10;
        }
        return digits;
    }
}
