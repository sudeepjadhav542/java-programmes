
import java.util.Stack;

public class RemoveEffiecient {
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();

    public void add(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }

    }

    public int remove() {
        return first.pop();
    }

    public static void main(String args[]) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.add(45);
        queue.add((67));
        queue.add(90);

        System.out.println(queue.remove());
    }
}
