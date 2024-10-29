import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    public void add(int item) {
        first.push(item);
    }

    public int remove() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public static void main(String args[]) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.add(45);
        queue.add((67));
        queue.add(90);

        System.out.println(queue.remove());

    }
}
