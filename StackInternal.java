package OOpsfinal.st;
import java.util.Stack;
public class StackPlaylist {
    public static void main(String[] args) {
        //this is inbuit stack that we are using
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        //last in first out
        while(!st.isEmpty()){
            System.out.println(st.pop()+" ");
            //output -> 3 2 1
        }
    }
}


/*
* if we try to remove something from an empty stack then it will give us an empty stack exception
* insertion and removal is constant in a stack
* */
