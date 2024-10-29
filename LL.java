public class LL {
    private class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int size;

    public void insertFirst(int value) {
        Node node = new Node(value);

        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {
        if (size == 0) {
            insertFirst(value);
            size += 1;
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insert(int value, int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst() {
        int val = head.value;

        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
        return val;
    }

    public void deleteLast() {

        Node sl = getIndex(size - 2);
        tail = sl;
        tail.next = null;
        size--;

    }

    public void delete(int index)

    {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public Node getIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteDuplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;

            } else {
                node = node.next;
            }

        }
    }

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while (f != null & s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
            while (f != null) {
                ans.insertLast(f.value);
                f = f.next;
            }
            while (s != null) {
                ans.insertLast(s.value);
                s = s.next;
            }

        }
        return ans;

    }

    public boolean isCycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHappy(int n) {
        int s = n;
        int f = n;
        do {
            s = fSquare(s);
            f = fSquare(fSquare(f));
        } while (s != f);
        if (s == 1) {
            return true;
        }
        return false;

    }

    private static int fSquare(int n) {
        int ans = 0;
        while (n > 0) {
            int r = n % 10;
            ans += r * r;
            n /= 10;
        }
        return ans;
    }

    public Node middleNode() {
        Node s = head;
        Node f = head;
        while (f != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static void main(String args[]) {
        LL first = new LL();
        LL second = new LL();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);
        LL ans = merge(first, second);
        ans.display();
        System.out.println(ans.middleNode());
        // System.out.println(ans.isCycle());
        System.out.println(isHappy(19));

    }
}
