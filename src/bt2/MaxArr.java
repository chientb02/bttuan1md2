package bt2;

public class MaxArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
