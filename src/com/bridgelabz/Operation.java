package com.bridgelabz;

import java.util.Scanner;
public class Operation {
    MyStack front, rear;

    public Operation() {
        this.front = this.rear = null;
    }
    // Method to add a key to the queue.
    void enterQueue(int data) {
        // Create a new LinkedList node
        MyStack temp = new MyStack(data);//object
        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
        }
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
}