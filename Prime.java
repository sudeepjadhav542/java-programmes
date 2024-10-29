import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // for(int i=0;i<n;i++)
        //
        // System.out.println(i+" "+isPrime(i));
        // }
        System.out.println(isPrime(n));

    }
}
