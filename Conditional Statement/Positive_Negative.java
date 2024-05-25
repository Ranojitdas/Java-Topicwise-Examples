import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int a = input.nextInt();
            if (a>=0){
                System.out.println("The number is positive");
            }
            else{
                System.out.println("The number is negative");
            }

    }
}
