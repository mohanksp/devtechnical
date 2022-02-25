package concurrency;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello concurrency");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);

        Queue<Integer> queueArr = new ArrayDeque<>();
        queueArr.add(8);
        Queue<Integer> queueList = new LinkedList<>();
        queueList.add(8);


        Deque<Integer> dequeArr = new ArrayDeque<>();
        dequeArr.addFirst(2);

        Deque<Integer> dueueList = new LinkedList<>();
        dueueList.addFirst(8);



    }
}
