public class Sum_Avg2dArray {
    public static void main(String[] args) {
        int[][] arr = Array2dUtility.inputArray();
        int sum = Sum(arr);
        int avg = avg(arr);
        System.out.println(sum);
        System.out.println(avg);
    }
    public static int Sum(int[][] arr){
        int i=0;
        int sum = 0;
        while(i<arr.length){
            int j= 0;
            while (j< arr.length){
                sum = sum + arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static int avg(int[][] arr){
       int  sum = Sum(arr);
       int num = 0;
       int i = 0;
        while(i<arr.length){
            int j= 0;
            while (j< arr.length){
                num++;
                j++;
            }
            i++;
        }
        return sum / num;
    }

}
