import java.util.Arrays;
import java.util.Scanner;

public class Array_Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr ={1,2,3,4,5,6,7,8,9,45,75,15,24,78,15,10,20,30,40,50,60,70,80,90,46,82,76,94,61,29};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the number you want to search : ");
        int n = input.nextInt();
        System.out.println(n + " number is found in the index : " + Arrays.binarySearch(arr,n));


    }
}
