public class M {

    public static void main(String args[]) {
        boolean[][] maze = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };
        maze("", maze, 0, 0);
    }

    public static void maze(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // if (r < maze.length - 1 && c < maze[0].length - 1) {
        // maze(p + "D", maze, r + 1, r + 1);
        // }
        if (r < maze.length - 1) {
            maze(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            maze(p + "R", maze, r, c + 1);
        }
    }
}
