package com.bridgelabz;
import java.util.Queue; //importing Queue
import java.util.LinkedList;

public class StacksAndQueues
{
    //main method
    public static void main(String args[])
    {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Welcome to Stacks and Queues Program.");
        //inserts the specified element into this queue
        queue.offer(56); //Setting Queue and inserting elements
        queue.offer(30);
        queue.offer(70);
        //The element() method in Java Queues is used to return the element at the front of the container and does not remove it.
        System.out.println("\nQueue head = " + queue.element());
        System.out.print("Removing element from queue = " + queue.remove());
        System.out.println("\nRemaining Queue elements...");
        Object remainingElements;
        //The poll() method of Queue Interface returns and removes the element at the front end of the container.
        while ((remainingElements = queue.poll()) != null) {
            System.out.println(remainingElements);
        }
    }
}