public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] arr = Array2dUtility.inputArray();
        long sum = SumOfDiagonals(arr);

        System.out.println("Sum of Diagonals is : "+ sum);
    }
    public static long SumOfDiagonals(int[][] arr){
        long leftSum = SumOfLeftDiagonals(arr);
        long rightSum = SumOfRightDiagonals(arr);
        long sum = leftSum + rightSum;
        if (arr.length %2 != 0){
            int ind = arr.length /2;
            sum = sum - arr[ind][ind];
        }
        return sum;
    }
    public static long SumOfLeftDiagonals(int[][] arr){
        long sum;
        sum = 0;
        int i = 0;
//        while (i< arr.length){
//            while ()
//        }
        return sum;
    }
    public static long SumOfRightDiagonals(int[][] arr){
        long sum;
        sum = 0;
        return sum;
    }
}
