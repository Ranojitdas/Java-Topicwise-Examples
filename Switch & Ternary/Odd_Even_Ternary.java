import java.util.Scanner;
public class Odd_Even_Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = input.nextInt();
        String result;
        result = (a%2 == 0) ? "Even":"Odd"   ;
        System.out.println("The number is " + result);
    }
}
