import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze("", 3, 3));
    }

    public static ArrayList<String> maze(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (c > 1 && r > 1) {
            list.addAll(maze(p + "D", r - 1, c - 1));
        }
        if (r > 1) {
            list.addAll(maze(p + "V", r - 1, c));
        }
        if (c > 1) {
            list.addAll(maze(p + "H", r, c - 1));
        }
        return list;
    }
}
