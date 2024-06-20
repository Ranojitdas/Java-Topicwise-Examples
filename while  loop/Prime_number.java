import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        boolean isPrime = prime(n);
        if (isPrime){
            System.out.println("The number is not a prime number");
        }
        else System.out.println("The number is a prime number");
    }
    public static boolean prime(int n){
        int i =2;
        while(i < n){
            if (n%i == 0){
                return true;
            }
            i++;
        }
        return false;
    }
}
