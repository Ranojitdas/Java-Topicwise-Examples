import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
     int a =  number();
      if (a>90){
          System.out.println("Your Grade is 'A");
      } else if (a > 75 && a<90) {
          System.out.println("Your Grade is 'B'");
      } else if (a > 60 && a<75) {
          System.out.println("Your Grade is 'C'");
      } else if (a > 30 && a<60) {
          System.out.println("Your Grade is 'D'");
      }
      else System.out.println("Your Grade is 'F'");

    }
    public static int number(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (between 1 to 100 ): ");
        return input.nextInt();
    }
}
