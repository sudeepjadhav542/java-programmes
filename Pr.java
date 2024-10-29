import java.util.Arrays;

public class Pr {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            swap(arr, s, e);
            s++;
            e--;
        }

    }

    public static void swap(int arr[], int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }
}
