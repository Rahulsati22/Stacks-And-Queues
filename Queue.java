package OOpsfinal.st;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueIn {
    public static void main(String[] args) {
        //This is normal queue
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()){
            //it helps us find the top element of the array and does not remove it
            System.out.println(q.peek());
            //it will remove the top elements of the array
            q.remove();
        }



        //This is doubly ended queue
        //this do not have any restriction
        //faster than linkedlist and stack
        // in trees we will use this
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.addFirst(20);
        dq.addLast(30);
//        while (!dq.isEmpty()) System.out.println(dq.remove());

//        while (!dq.isEmpty()) System.out.println(dq.removeLast());
        while (!dq.isEmpty()) System.out.println(dq.removeFirst());

    }
}

/*
* Queue is not a class its an interface
* it follows first in first out
* when you wants to store the answer so far or the result so far then use stacks and queues for these purposes
* you can also use stacks and queues to convert recursion into iteration
*
*
*
* */

/*
*In dequeue you can remove and insert from both the ends
* Dequeue have various functions addFirst-->to add at the starting
* addLast-->to add at the last of the queue
* deleteFirst-->to delete the first element
* deleteLast-->to delete the last element
*diff between remove and poll --> poll will not throw exception when the queue is empty but remove will throw exception when the queue is empty and
* you are trying to remove element from the queue
* */
