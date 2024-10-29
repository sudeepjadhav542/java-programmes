public class SquareR {
    public static void main(String args[]) {
        int n = 40;
        int p = 3;
        Double v = squarRoot(n, p);
        System.out.println(v);

    }

    static Double squarRoot(int n, int p) {
        int s = 0;
        int e = n;
        Double root = 0.0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return root;
            }
            if (m * m > n) {
                e = m - 1;

            } else {
                s = m + 1;
            }
        }
        Double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root < n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;

    }
}
