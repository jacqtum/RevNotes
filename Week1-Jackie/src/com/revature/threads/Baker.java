package com.revature.threads;

import java.util.concurrent.BlockingQueue;

public class Baker implements Runnable{
	
	private BlockingQueue<Message> queue;
	
	public Baker(BlockingQueue<Message> queue){
		
		this.queue = queue;
		
	}

	@Override
	public void run() {
		System.out.println("\nI am in Baker's run() method.");
		
		for(int i = 1; i < 21; i++){
			
			Message msg = new Message("bagel " + i + "");
			
			try {
				queue.put(msg);
				System.out.println("Baker baked " + msg.getMsg());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}