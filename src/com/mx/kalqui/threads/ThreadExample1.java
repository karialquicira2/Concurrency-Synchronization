/**
 * 
 */
package com.mx.kalqui.threads;

/**
 * @author karin
 */
public class ThreadExample1 {

	public static void main(String[] args) {
		// Create instances of your custom Thread
		Thread threadA = new MyThreadTask("Thread-A");
		Thread threadB = new MyThreadTask("Thread-B");

		// Start the threads
		threadA.start();
		threadB.start();
	}

}
