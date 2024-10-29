public class Stack {
    int data[];
    int ptr = -1;
    public static final int DEFAULT_SIZE = 10;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return ptr == data.length;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int val) throws Exception {
        if (isFull()) {
            throw new StackException("stack is Full");
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new StackException("stack is Empty");
        }
        System.out.println(data.length);
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new StackException("stack is Empty");
        }
        return data[ptr];
    }

    public class DynamicStack extends Stack {
        public DynamicStack() {
            super();
        }

        public DynamicStack(int size) {
            super(size);
        }

        public boolean push(int val) throws Exception {
            if (this.isFull()) {
                int[] temp = new int[data.length * 2];

                for (int i = 0; i < data.length; i++) {
                    temp[i] = data[i];
                }
                data = temp;
            }
            return super.push(val);
        }

    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " -> ");
        }
    }

    public class StackException extends Exception {
        public StackException(String message) {
            super(message);
        }
    }

    public static void main(String args[]) throws Exception {

        Stack stack = new Stack(12).new DynamicStack();
        stack.push(3);
        stack.push(4);
        stack.push(45);
        stack.push(5);
        stack.push(49);
        stack.display();

        System.out.println(stack.pop());

    }
}