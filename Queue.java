public class Queue {
    private int data[];
    private static final int DEFAULT_SIZE = 10;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data = new int[size];

    }

    int ptr = -1;

    public boolean insert(int val) throws Exception {
        if (isFull()) {
            throw new QueueException("Queue is FUll");
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new QueueException("Queue is Empty");
        }
        int removed = data[0];

        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        ptr--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new QueueException("Queue is Empty");
        }
        return data[0];
    }

    public boolean isFull() {
        return ptr == data.length;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

    public class QueueException extends Exception {
        public QueueException(String message) {
            super(message);
        }
    }

    public class DynamicQueue extends Queue {
        public DynamicQueue() {
            super(DEFAULT_SIZE);
        }

        public DynamicQueue(int size) {
            super(size);
        }

        public boolean insert(int val) throws Exception {
            if (isFull()) {
                int temp[] = new int[data.length * 2];
                for (int i = 0; i < data.length; i++) {
                    temp[i] = data[i];
                }
                data = temp;
            }
            return super.insert(val);
        }
    }

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(2).new DynamicQueue();
        queue.insert(56);
        queue.insert(78);
        queue.insert(90);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

    }
}
