import java.util.Arrays;

public class Sorting {
    public static void SelSort(int arr[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    public static void BubbleSort(int arr[], int n) {
        for (int i = n - 1; i >= 1; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;

                }
            }
            if (didSwap == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        // SelSort(arr, n);
        BubbleSort(arr, n);
        System.out.println(Arrays.toString(arr));

    }
}
