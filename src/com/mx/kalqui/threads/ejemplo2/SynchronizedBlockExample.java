/**
 * @author Karina
 * 
 */
package com.mx.kalqui.threads.ejemplo2;

/**
 * 
 */
public class SynchronizedBlockExample {

	private final Object lock = new Object();
	private int count = 0;

	public static void main(String[] args) {
		SynchronizedBlockExample example = new SynchronizedBlockExample();

		// Create multiple threads to increment the counter.
		Thread t1 = new Thread(() -> example.increment());
		Thread t2 = new Thread(() -> example.increment());

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Final count: " + example.getCount());
	}

	public void increment() {
		synchronized (lock) {
			count++;
		}
	}

	public int getCount() {
		return count;
	}
}
