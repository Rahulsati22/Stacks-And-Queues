package queue;

public class CircularDequeueDynamic {
    protected int data[];
    private static int Default_Size = 10;
    int end = 0, front = 0, size = 0;

    public CircularDequeue() {
        data = new int[Default_Size];
    }

    public CircularDequeue(int size) {
        data = new int[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean insert(int val) {
        if (isFull()) {
            int temp[] = new int[2 * data.length];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(i + front) % data.length];
            }

            front = 0;
            end = data.length;
            data = temp;
        }
//        System.out.println(Arrays.toString(data));
        data[end] = val;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int delete() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty therefore we cannot remove the items");
        }
        int val = data[front++];
        front = front % data.length;
        size--;
        return val;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty therefore we cannot find the first item");
        }
        return data[front];
    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("array is empty that's why we cannot display it");
        }
        int i = front;
        do {
            System.out.print(data[i++] + " ");
            i = i % data.length;
        } while (i != end);
    }
}

class Main2 {
    public static void main(String[] args) throws Exception {
        CircularDequeue ab = new CircularDequeue(5);
        ab.insert(1);
        ab.insert(2);
        ab.insert(3);
        ab.insert(4);
        ab.insert(5);
        ab.insert(10);
        ab.insert(20);
        ab.insert(1);
        ab.insert(2);
        ab.display();
    }
}
