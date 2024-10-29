
import java.util.Scanner;

public class maxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("max of subarray:" + maxSumNum(n, a));
    }

    static int maxSumNum(int n, int a[]) {
        int curSum = 0;
        int maxSum1 = 0;
        for (int i = 0; i < n; i++) {
            curSum = curSum + a[i];
            if (curSum > maxSum1) {
                maxSum1 = curSum;

            }
            if (curSum < 0) {
                curSum = 0;
            }

        }
        return maxSum1;
    }

}
