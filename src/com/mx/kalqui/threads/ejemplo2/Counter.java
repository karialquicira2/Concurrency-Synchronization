/**
 * 
 */
package com.mx.kalqui.threads.ejemplo2;

/**
 * @author Karina
 * 
 */
public class Counter {

	private int count = 0;

	public static void main(String[] args) {
		Counter counter = new Counter();

		// Create multiple threads to increment the counter
		Thread t1 = new Thread(() -> counter.increment());
		Thread t2 = new Thread(() -> counter.increment());

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Final count: " + counter.getCount());
	}

	// Ejemplo método sincronizado.
	public synchronized void increment() {
		System.out.println("Counter: " + count);
		count++;
	}

	public int getCount() {
		return count;
	}
}
