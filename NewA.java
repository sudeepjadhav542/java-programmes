class NewA {
	public static void main(String args[]) {
		NewA obj = new NewA();
		int[] arr = { 4, 5, 59, 5, 9, 4, 655, 6 };
		int size = arr.length;
		obj.display(arr, size);
		obj.insertArray(arr, size, 100, 2, 6);
		size += 1;
		obj.display(arr, size);
	}

	public static void display(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int insertArray(int arr[], int size, int capacity, int index, int ele) {
		if (size >= capacity) {
			return -1;
		}
		for (int i = size - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = ele;
		return 1;
	}
}