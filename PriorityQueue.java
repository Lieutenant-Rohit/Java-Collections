import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new java.util.PriorityQueue<>();
//        Queue<Integer> queue = new java.util.PriorityQueue<>((x,y)->y-x);
        queue.offer(10);
        queue.offer(21);
        queue.offer(9);
        queue.offer(1);
        queue.offer(1);
        System.out.println(queue);
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
