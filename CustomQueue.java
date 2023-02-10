package queue;

import java.util.Arrays;

public class CustomQueue {
    private int data[];
    private static int Default_Size = 10;
    int end = 0;

    public CustomQueue() {
        data = new int[Default_Size];
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
         if (end == data.length) return true;
         return false;
    }

    public boolean insert(int val) {
        if (isFull()) {
            System.out.println("The queue is full and you cannot insert more items into it");
            return false;
        }
//        System.out.println(Arrays.toString(data));
        data[end++] = val;
        return true;
    }

    public int delete() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty therefore we cannot remove the items");
        }
        int val = data[0];
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return val;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty therefore we cannot find the first item");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("END");
    }
}
class Main{
    public static void main(String[] args) throws Exception{
        CustomQueue ab = new CustomQueue(5);
        ab.insert(1);
        ab.insert(2);
        ab.insert(3);
        ab.insert(4);
        ab.insert(5);
        ab.display();
        while (!ab.isEmpty())
            System.out.println(ab.delete());
    }
}
