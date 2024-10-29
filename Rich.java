public class Rich {

    public static void main(String args[]) {
        int n = 10 << 2;
        System.out.println(n);
        int arr[] = { 3, 3, 96, 5, 5, 8, 8 };
        System.out.println(ans(arr));
    }

    static int ans(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
}
