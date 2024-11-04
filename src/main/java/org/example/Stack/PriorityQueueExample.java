package org.example.Stack;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(20);
        pq.offer(5);
        pq.offer(30);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
