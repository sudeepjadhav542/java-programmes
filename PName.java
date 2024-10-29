import java.util.Scanner;

public class PName {
    void countNo() {
        Scanner in = new Scanner(System.in);
        int n;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        do {
            System.out.println("enter thre number:");
            int num = in.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("do u want to add:");
            n = in.nextInt();

        } while (n == 1);

        System.out.println(
                "u have entered " + positive + " positive no " + (negative) + " negative no " + (zero) + " zeros ");
    }

    public static void main(String args[]) {
        PName obj = new PName();

        obj.countNo();

    }
}
