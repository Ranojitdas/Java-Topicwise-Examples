import java.util.Scanner;

public class Student_ScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your marks : ");
        int marks = input.nextInt();
        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate":"Low");
        System.out.println("Your category is " + category);
    }
}
