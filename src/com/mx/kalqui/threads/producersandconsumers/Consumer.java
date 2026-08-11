/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

import java.util.concurrent.BlockingQueue;

/**
 * @author Karina
 * 
 */
public class Consumer implements Runnable {

	private BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Integer value = queue.take();// Consumes an item from the queue.
				if (value == -1) {
					break; // If sentinel value is encountered, stop consuming.
				}
				System.out.println("Consumed: " + value);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

}
