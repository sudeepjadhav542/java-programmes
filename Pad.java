import java.util.ArrayList;

public class Pad {
    public static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(pad(p + ch, up.substring(1)));
        }
        return list;
    }

    public static void main(String args[]) {
        System.out.println(pad("", "12"));
    }
}
