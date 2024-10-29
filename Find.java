import java.util.Scanner;

class Find {
	public static void main(String args[])

	{
		Scanner sc = new Scanner(System.in);
		int array[] = { 1, 2, 4, 5, 6, 8 };
		int n = array.length;
		// System.out.println("Enter the element to be searched:");
		// int num = sc.nextInt();
		// boolean isInArray = false;
		// for (int element : array) {
		// if (num == element) {
		// isInArray = true;
		// break;
		// }
		// }
		// if (isInArray) {
		// System.out.println("elemetn present in array");

		// } else {
		// System.out.println("elemetn not present in array");
		// }

		for (int i = 0; i < n - 1; i++) {
			System.out.println(array[(n - 1 - i)]);
		}

	}
}