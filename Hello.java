import java.util.Arrays;

public class Hello {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	public static void rev(int arr[]) {
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			swap(arr, i, j);
			i++;
			j--;
		}

	}

	public static void main(String a[]) {
		System.out.println(sum(8, 9));
		System.out.println("hello World");
		int arr[] = { 1, 2, 3, 4, 5 };
		rev(arr);
		System.out.println(Arrays.toString(arr));
	}
}