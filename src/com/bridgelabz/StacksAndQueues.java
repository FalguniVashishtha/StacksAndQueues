package com.bridgelabz;
import java.util.Scanner;
public class StacksAndQueues {
    //main method
    public static void main(String args[]) {
        System.out.println("Welcome to Stacks and Queues Program.");
        Operation operation = new Operation();//creating object
        operation.enqueue(56);
        operation.enqueue(30);
        operation.enqueue(70);
        System.out.println("Queue Front data: " + operation.front.data);
        System.out.println("Queue Rear data: " + operation.rear.data);
    }
}