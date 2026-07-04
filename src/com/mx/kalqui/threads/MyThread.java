/**
 * 
 */
package com.mx.kalqui.threads;

/**
 * 
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " printing: " + i);
			try {
				Thread.sleep(500); // Simulate work with delay
			} catch (InterruptedException e) {
				System.out.println("Thread interrumped: " + e.getMessage());
			}
		}
	}

}

class ThreadExample {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		thread1.start(); // Start the first thread
		thread2.start(); // Start the second thread
	}

}
