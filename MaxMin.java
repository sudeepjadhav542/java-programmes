import java.util.AbstractMap;

public class MaxMin {
    public static AbstractMap.SimpleEntry<Integer, Integer> maxMin(int arr[]) {
        if (arr.length == 0) {
            return new AbstractMap.SimpleEntry<>(0, 0);

        }
        int max = arr[0];
        int min = arr[0];
        for (int e : arr) {
            if (e < min) {
                min = e;
            } else if (e > max) {
                max = e;
            }
        }
        return new AbstractMap.SimpleEntry<>(max, min);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 8, 1, 52, 8 };
        AbstractMap.SimpleEntry<Integer, Integer> res = maxMin(arr);
        System.out.println("max:" + res.getKey() + ", Min: " + res.getValue());

    }
}
