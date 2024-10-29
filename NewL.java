class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class NewLL {
    static Node convertArray(int arr[]) {

        Node head = new Node(arr[0]);
        Node ptr = head;

        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            ptr.next = node;
            ptr = ptr.next;
        }
        return head;
    }

    static int length(Node head) {
        int count = 0;
        Node ptr = head;
        while (ptr != null) {
            count++;
            ptr = ptr.next;

        }
        return count;
    }

    public static void main(String a[]) {
        int arr[] = { 1, 2, 4, 5, 6 };
        Node head = convertArray(arr);
        Node temp = head;
        System.out.println(length(head));

        while (temp != null) {
            System.out.println(temp.data + " ");
            System.out.println("fuckk");
            temp = temp.next;

        }
    }
}