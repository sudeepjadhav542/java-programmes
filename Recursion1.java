public class Recursion1 {

    static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Harry");
        printName(n - 1);
    }

    static void printNum(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    static void printNum2(int n) {
        if (n == 1) {
            return;
        }
        System.out.println(n);
        printNum2(n - 1);
    }

    public static void main(String[] args) {
        printName(5);
        printNum(1);
        printNum2(5);
    }
}
