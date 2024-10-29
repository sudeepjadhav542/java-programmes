public class Search {
    public static void main(String[] args) {
        String name = "Jigar";
        char target = 'n';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }

        }
        return false;
    }

}
