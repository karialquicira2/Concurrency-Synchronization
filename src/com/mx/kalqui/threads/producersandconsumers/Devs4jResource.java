/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

import java.util.LinkedList;

/**
 * @author Karina
 * 
 */
public class Devs4jResource {

	private LinkedList<Integer> resources = new LinkedList<Integer>();

	public synchronized int consume() throws InterruptedException {
		while (resources.size() <= 0) {
			wait();
		}
		return resources.poll();
	}

	public synchronized void produce(int value) {
		resources.offer(value);
		notifyAll();
	}

}
