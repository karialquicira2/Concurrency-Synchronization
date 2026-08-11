/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Karina
 * 
 */
public class ExampleProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(); // Shared queue.
		Thread producerThread = new Thread(new Producer(queue));
		Thread consumerThread = new Thread(new Consumer(queue));

		producerThread.start(); // Start producer thread.
		consumerThread.start(); // Start consumer thread.

	}

}
