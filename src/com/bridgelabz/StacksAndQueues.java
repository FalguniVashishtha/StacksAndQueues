package com.bridgelabz;
import java.util.Scanner;
public class StacksAndQueues {
    public static void main(String args[]){
        System.out.println("Welcome to Stacks and Queues Program.");
        int choose;
        Scanner sc = new Scanner(System.in);
        Operation operation = new Operation();
        do {
            System.out.println("Enter the options:\n1. To push the data\n2. Display the Stack\n3. To exit");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    operation.push(sc); //calling method to push the data
                    break;
                case 2:
                    operation.display();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter invalid input");
                    break;
            }
        }while (choose != 3);
    }

}
