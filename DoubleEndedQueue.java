import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DoubleEndedQueue {
    public static void main(String[] args) {

        //  double-ended queue
        //  allows insertion and removal of elements from both ends
        //  versatile than regular queues and stacks because they support all the operations of both

          /*
           INSERTION METHODS

           addFirst(E e): Inserts the specified element at the front.
           addLast(E e): Inserts the specified element at the end.
           offerFirst(E e): Inserts the specified element at the front if possible.
           offerLast(E e): Inserts the specified element at the end if possible.

           */


            /*

           REMOVAL METHODS

            removeFirst(): Retrieves and removes the first element.
            removeLast(): Retrieves and removes the last element.
            pollFirst(): Retrieves and removes the first element, or returns null if empty.
            pollLast(): Retrieves and removes the last element, or returns null if empty.

           */

        /*

           EXAMINATION METHODS

            getFirst(): Retrieves, but does not remove, the first element.
            getLast(): Retrieves, but does not remove, the last element.
            peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
            peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.

           */

        /*

           STACK METHODS

            push(E e): Adds an element at the front (equivalent to addFirst(E e)).
            pop(): Removes and returns the first element (equivalent to removeFirst())..

           */
        Deque<Integer> deque1 = new ArrayDeque<>(); //Faster coz of array i.e., faster index. NO NULL allowed!!....
        // Array is circular so there is no need to shift element if we remove from start.(HEAD AND TAIL ONLY SHIFTS).
        Deque<Integer> deque2 = new LinkedList<>(); // Use if we want to do insertion or deletion in middle.
        deque1.addFirst(5);
        deque1.addLast(10);
        deque1.addFirst(12);
        deque1.addLast(20);
        System.out.println(deque1);
        deque1.removeFirst();
        deque1.pollLast();
        System.out.println(deque1);


    }
}
