package com.revature.threads;

import java.util.concurrent.BlockingQueue;

public class Customer implements Runnable{
	
	private BlockingQueue<Message> queue;
	
	private String name;
	
	public Customer(BlockingQueue<Message> q, String name){
		
		this.queue = q;
		
		this.name = name;
		
	}

	@Override
	public void run() {
		System.out.println("\nI am in Customer's run() method. ");
		Message msg = null;
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while (!(msg = queue.take()).getMsg().equals("exit")){

				System.out.println("Customer ate " + msg.getMsg() + " by " + name);
				
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}