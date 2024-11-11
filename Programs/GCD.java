import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int m = input.nextInt();
        System.out.print("Enter the second number ");
        int n = input.nextInt();
        int ans = gcd(m,n);
        System.out.println("The answer is : " + ans );
    }
    public static int gcd(int m , int n){
        int i = 2;
        int gcd_value = 0;
        while(i<=n){
            if (m%i==0 && n%i==0){
                gcd_value = i;
            }
            i++;
        }
        return gcd_value;
    }

}
