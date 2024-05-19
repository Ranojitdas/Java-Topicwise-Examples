import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        int a = number();
        int b = number();
        int c = number();
        if(a>b && c>a){
            System.out.println(a + " is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b + " is greatest");
        }
        else System.out.println(c + " is greatest");


    }
    public static int number(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        return input.nextInt();
    }
}
