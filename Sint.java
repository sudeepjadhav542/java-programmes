import java.util.Arrays;

public class Sint {
    public static void main(String args[]) {
        int[][] arr = {
                { 1, 2, 4 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 79;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int arr[][], int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        int max = Integer.MIN_VALUE;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    return new int[] { r, c };
                }

            }

        }
        return new int[] { -1, -1 };
    }
}
