import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A :");
        int A = input.nextInt();
        System.out.println("Enter the value of B :");
        int B = input.nextInt();
        int C = A;
        A = B;
        B = C;
        System.out.println(A);
        System.out.println(B);

    }
}
