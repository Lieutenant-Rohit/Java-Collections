import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class JavaQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println(queue.size());
//        System.out.println(queue.remove()); //Throw exception
//        System.out.println(queue.element());//Throw exception
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        queue2.add(2);
        queue2.add(12);
//      queue2.add(23); //Shows exception queue is full
        queue2.offer(21); //Returns null

    }
}
