
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LLC {
    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.val == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.val != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public boolean find(int value) {
        Node current = head;
        while (current != null) {
            if (current.val == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean hasCycle() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle found
    }

    public static void main(String[] args) {
        LLC linkedList = new LLC();

        // Insert elements
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        // Check if the linked list has a cycle
        boolean hasCycle = linkedList.hasCycle();
        System.out.println("Has Cycle: " + hasCycle);

        // Insert a cycle
        linkedList.head.next.next.next.next = linkedList.head.next; // Create a cycle

        // Check if the linked list has a cycle after insertion
        hasCycle = linkedList.hasCycle();
        System.out.println("Has Cycle: " + hasCycle);

        // Delete an element
        linkedList.delete(3);

        // Find an element
        boolean found = linkedList.find(2);
     
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
