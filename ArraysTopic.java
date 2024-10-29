import java.util.*;

public class ArraysTopic {
    static int removeDuplicates(int arr[], int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n - 1; i++) {
            set.add(arr[i]);
        }
        int setSize = set.size();
        int index = 0;
        for (int ele : set) {
            arr[index] = ele;
            index++;
        }
        return setSize;
    }

    static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void RotateArray(int arr[], int n, int k) {
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void swap(int nums[], int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int ele : set) {
            ans.add(ele);
        }
        return ans;
    }

    // optimal solution
    static int findMissing(int arr[], int n) {
        if (arr.length == 1) {
            return 0;
        }
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        return sum1 - sum2;
    }

    // finding missing number by using hashing
    static int findMissingHash(int arr[], int n) {
        int hash[] = new int[n + 2];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    static int subArrays(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    static int[] findInterSection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                set.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int res[] = new int[set.size()];
        int index = 0;
        for (int x : set) {
            res[index++] = x;
        }
        return res;
    }

    static void Sort123(int arr[], int n) {
        int mid = 0;
        int low = 0;
        int high = n - 1;
        while (high >= mid) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            }
            if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                mid++;
                high--;
            }
        }
    }

    static int[] sortArray(int[] arr, int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0++;
            else if (arr[i] == 1)
                count1++;
            else {
                count2++;
            }

        }
        System.out.println(count1);
        for (int i = 0; i < count0 + 1; i++) {
            arr[i] = 0;
        }
        for (int i = count0 + 1; i < count1 + 1; i++) {
            arr[i] = 1;
        }
        for (int i = count1 + 1; i < count2 + 1; i++) {
            arr[i] = 2;
        }
        return arr;

    }

    static void reArrangeArray(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[index++] = arr[i];
            }
        }
        index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg[index++] = arr[i];
            }
        }
        for (int i = 0; i < n / 2; i++) {
            arr[i * 2] = pos[i];
            arr[i * 2 + 1] = neg[i];
        }

        System.out.println(Arrays.toString(pos));

        System.out.println(Arrays.toString(neg));
        System.out.println(Arrays.toString(arr));

    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
            }
            max = Math.max(max, arr[i]);
        }
        return ans;
    }

    // linear search
    static boolean LS(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return true;
            }
        }
        return false;
    }

    // finding the longest element consecutive sequence in array
    static int longestConseEle(int arr[]) {
        int n = arr.length;
        int longest = 0;
        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            int cnt = 1;
            while (LS(arr, ele + 1)) {
                ele = ele + 1;
                cnt++;
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }

    static void markRow(int arr[][], int i) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    static void markCol(int arr[][], int j) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    static void setZero(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i);
                    markCol(arr, j);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ArrayList<Integer> ans = new ArrayList<>();
        // // int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        // int nums[] = { 1, 2, 4, 5 };
        // int mis = findMissingHash(nums, nums.length);
        // System.out.println(mis);
        // int n = arr1.length;
        // int m = arr.length;
        // int nl = nums.length;
        // // System.out.println("Enter the value of k");
        // // int k = in.nextInt();

        // // ans = findUnion(arr1, arr, n, m);
        // // System.out.println(ans);
        // int missing = findMissing(nums, nl);
        // System.out.println(missing);
        // int[] arr1 = { 4, 9, 5 };
        // int arr2[] = { 9, 4, 9, 8, 4 };
        // System.out.println(Arrays.toString(findInterSection(arr1, arr2)));
        // System.out.println(subArrays(arr, k);
        // int arr[] = { 1, 2, 0 };
        // int n = arr.length;
        // Sort123(arr, n);
        // System.out.println(Arrays.toString(arr));
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(2, 1);
        // map.put(2, 1);

        // System.out.println(Arrays.toString(sortArray(arr, n)));

        // ans = leaders(arr, n);
        // System.out.println(ans);
        // String name = "sudeep";
        // System.out.printf("my name is :%s", name);
        // int arr[] = { 100, 4, 200, 1, 3, 2 };
        // int n = arr.length;
        // Arrays.sort(arr);
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i] + " ");
        // }
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 0, 6 },
                { 7, 8, 9 }
        };
        setZero(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
