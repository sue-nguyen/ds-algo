package data_structures.stack_queue;

/**
 * A demo for the queue.
 */
public class Queue_Demo {
    public static void main(String[] args) {
        Queue<Double> q = new Queue<>();
        System.out.println("Is queue empty? " + q.isEmpty());
        q.print();

        q.enqueue(4.0);
        q.print();

        q.dequeue();
        q.print();

        q.enqueue(2.42);
        q.print();
        System.out.println("Size: " + q.size());
        System.out.println("Peek: " + q.peek());

        q.enqueue(10.5);
        q.print();
        System.out.println("Size: " + q.size());

        q.enqueue(3.06);
        q.print();
        System.out.println("Size: " + q.size());

        q.enqueue(30.5);
        q.print();
        System.out.println("Size: " + q.size());

        q.enqueue(88.0);
        q.print();
        System.out.println("Size: " + q.size());

        q.enqueue(6.12);
        q.print();
        System.out.println("Size: " + q.size());

        System.out.println("Poll: " + q.poll());
        q.print();
        System.out.println("Size: " + q.size());

        System.out.println("Poll: " + q.poll());
        q.print();
        System.out.println("Size: " + q.size());

        System.out.println("Poll: " + q.poll());
        q.print();
        System.out.println("Size: " + q.size());
    }
}
