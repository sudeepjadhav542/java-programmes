import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class movezero {
    public static void moveZero(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(arr[i]);
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        for (int i = arr.length - list.size(); i < arr.length; i++) {
            arr[i] = list.get(i - (arr.length - list.size()));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
