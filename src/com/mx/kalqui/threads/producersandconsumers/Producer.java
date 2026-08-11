/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

import java.util.concurrent.BlockingQueue;

/**
 * @author Karina
 * 
 */
public class Producer implements Runnable {

	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				queue.put(i); // Produces an item and puts it into the queue.
				System.out.println("Produced: " + i);
			}
			queue.put(-1); // Indicates end of production by adding a sentinel value.
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

}
