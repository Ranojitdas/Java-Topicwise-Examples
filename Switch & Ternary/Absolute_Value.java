import java.util.Scanner;

public class Absolute_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = input.nextInt();
        int result = a>=0 ? a : -a;
        System.out.println("The absolute value is : " + result);
    }

}
