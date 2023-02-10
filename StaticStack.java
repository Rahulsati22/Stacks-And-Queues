package OOpsfinal.st;

//this is the implementation of stack class
class CustomStack {
    protected int[] data;
    private static final int Default_Size = 10;
    int ptr = -1;

    public CustomStack() {
        this(Default_Size);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) {
        if (isFull()) {
            System.out.println("The array is full and we cannot insert more items into the array");
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public boolean isFull() {
        if (data.length - 1 <= ptr) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (ptr == -1) {
            return true;
        }
        return false;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty and cannot remove the element");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty and cannot peek the element");
        }
        return data[ptr];
    }
}

public class StackImplementation {
    public static void main(String[] args) throws Exception {
        CustomStack ab = new CustomStack(5);
        ab.push(1);
        ab.push(2);
        ab.push(3);
        ab.push(4);
        ab.push(5);
//        will give an exception
//        ab.push(6);
        System.out.println(ab.peek());
        while (!ab.isEmpty())
            System.out.print(ab.pop() + " ");

//        this will throw an exception
//        ab.pop();


    }

}
