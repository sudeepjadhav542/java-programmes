import java.util.Scanner;

public class NP {
    public static int[] bubbleSort(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }

            }

        }
        return arr;
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemetns");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("done");

        int newArray[] = bubbleSort(arr, n);
        printArray(newArray, n);
    }
}