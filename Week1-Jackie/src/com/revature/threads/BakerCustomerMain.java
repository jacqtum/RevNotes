package com.revature.threads;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;



public class BakerCustomerMain {

	public static void main(String[] args) {
		/*
		 *  1. New queue is created.
		 *  2. New Baker and the Customer objects are created with the queue passed into the objects.
		 *  3. Three threads are created. 1 for the baker and 1 for each customer.
		 *  4. t.start() calls the run method.
		 */
		System.out.println("\nBefore queue is created. ");
		BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
		
		System.out.println("\nBefore baker is created. ");
		Baker baker = new Baker(queue);
		
		System.out.println("\nBefore customer 1 is created. ");
		Customer customer1 = new Customer(queue, "Customer 1");
		
		System.out.println("\nBefore customer 2 is created. ");
		Customer customer2 = new Customer(queue, "Customer 2");
		
		
		
		System.out.println("\nBefore Thread(baker).start() begins: ");
		new Thread(baker).start();
		
		System.out.println("\nBefore Thread t begins. ");
		Thread t = new Thread(customer1);
		//t.setPriority(10);
		
		System.out.println("\nBefore t.start begins. ");
		t.start();
		
		System.out.println("\nBefore Thread(customer2).start() begins. ");
		new Thread(customer2).start();
		
		System.out.println("Business has opened.");
		
		
	}

}
