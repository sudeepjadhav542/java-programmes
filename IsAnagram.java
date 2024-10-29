import java.util.*;
import java.util.Stack;
import java.util.HashMap;
public class IsAnagram {
    static boolean isAnagram(String s1, String s2) {
        int count[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)] += 1;
            count[s2.charAt(i)] -= 1;

        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    static boolean balancedString(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty()) {
                st.push(ch);
            } else if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' && st.peek() == '(') {
                st.pop()
            } else if (ch == '}' && st.peek() == '{') {
                st.pop();
            } else if (ch == ']' && st.peek() == '[') {
                st.pop();
            }
        }
        return st.isEmpty();

    }

    static void list(String s) {
        for (String i : s.split(" ")) {
            if (i.length() % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void sumStringNumber(String s1, String s2) {
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(sum);
        System.out.println(String.valueOf(sum) instanceof String);
    }

    static int countWords(String s) {
        int count = 0;
        if (s.charAt(0) != ' ') {
            count++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static char firstNonRepeatingChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }
        return ' ';
    }

    static void countCharWithWords(String s) {
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String sb = "";
            while (i < s.length() && ch[i] != ' ') {
                sb += ch[i];
                i++;
            }
            if (sb.length() > 0)
                System.out.println(sb + " -> " + sb.length());

        }
    }

    static boolean isPanagram(String s) {
        if (s.length() < 26)
            return false;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) < 0)
                return false;
        }
        return true;
    }

    static double findGrantsCap(double[] grantsArray, double newBudget) {

        double cap = 0;
        int i = 0;
        while (newBudget > 0) {
            grantsArray[i] -= 1.0f;
            newBudget--;
            System.out.println(i);
            System.out.println(newBudget);
            cap++;
        }
        return cap;
    }

    public static boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isInteger(double num) {
        return num == Math.floor(num);
    }

    static int countLocation(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            double num = Math.sqrt(arr[i]);
            if (Math.ceil(num) == Math.floor(num)) {

                count++;
            }

        }
        return count;
    }

    public static void findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }

    public static int sum(int nums[]) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            sum = sum + Math.abs(nums[i] - nums[i - 1]);
        }
        return sum;
    }

    static boolean isHAppy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (true) {
            if (n == 1)
                return true;

            n = sumOfD(n);
            if (set.contains(n))
                return false;
            set.add(n);
        }

    }

    static int sumOfD(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem;
            num = num / 10;
        }
        return sum;
    }

    static int fun(int a, int b) {
        if (b == 0)
            return a;
        return fun(b, a % b);
    }

    static int fun2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum == num;
    }

    public static boolean isAna(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] ch = new char[256];
        for (int i = 0; i < s1.length(); i++) {
            ch[s1.charAt(i)]++;
            ch[s2.charAt(i)]--;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != 0)
                return false;
        }
        return true;
    }

    public static boolean isAn(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {

            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))) {
                if (map.get(s2.charAt(i)) == 1)
                    map.remove(s2.charAt(i));
                else
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
            } else
                return false;

        }
        return map.isEmpty();

    }

    public static int maxSubArray(int[] arr) {
        if (arr.length == 0)
            return 0;

        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String args[]) {

        int[] arr = { 1, 2, 7, -4, 3, 2, -10, 9, 1 };
        System.out.println(maxSubArray(arr));

    }
}
