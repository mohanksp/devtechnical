package java8;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {



        Queue<Employee> queue = new PriorityQueue<>(6, Comparator.comparing(Employee::getName));
    }
}
