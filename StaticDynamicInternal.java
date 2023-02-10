package OOpsfinal.st;

import OOpsfinal.Dynamic;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int val) {
        if (this.isFull()) {
            //double the size
            int temp[] = new int[data.length * 2];
            //copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this time we know that the array is not full
        return super.push(val);
    }

    public static void main(String[] args) throws Exception {
        DynamicStack ab = new DynamicStack(5);
        ab.push(1);
        ab.push(2);
        ab.push(3);
        ab.push(4);
        ab.push(5);
        //this time it will not give us error
        ab.push(6);

        while (!ab.isEmpty())
            System.out.println(ab.pop());
    }
}
