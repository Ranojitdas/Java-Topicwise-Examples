import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int  sum = SumNum(n);
        System.out.println("The sum of numbers is : " + sum );
    }
    public static int SumNum(int n){
        int Sum = 0;
        while(n>0) {
            Sum += n % 10;
            n = n/10;
        }
        return Sum;
    }
}
