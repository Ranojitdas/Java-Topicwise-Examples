import java.util.Scanner;
public class Calculator_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :");
        int num2 = input.nextInt();
        System.out.print("Enter the operation : ");
        String operation = input.next();


        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> 0;
        };
        System.out.println("The result is "+ result);
    }
}
