import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int m = input.nextInt();
        System.out.print("Enter the Second number : ");
        int n = input.nextInt();
        int lcm_value = lcm(m,n);
        System.out.println("The LCM of "+ m + " And " + n + " is : " + lcm_value );
    }
    public static int lcm(int m , int n ){
        int i = 1;
        while (true){
            int factor = m*i;
            if (factor  % n == 0){
                return factor;
            }
            i++;
        }
    }
}
