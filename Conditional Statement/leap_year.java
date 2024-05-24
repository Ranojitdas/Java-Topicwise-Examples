import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int year = input.nextInt();
        if (year%4 == 0 && year%100 != 0){
            System.out.println("The year is a leap year");
        } else if (year%400 == 0) {
            System.out.println("The year is a leap year");
        }
        else System.out.println("The year is not a leap year");
    }
}
