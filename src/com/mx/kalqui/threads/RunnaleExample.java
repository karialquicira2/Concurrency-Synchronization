/**
 * 
 */
package com.mx.kalqui.threads;

/**
 * @author karin
 */
public class RunnaleExample {

	public static void main(String[] args) {
		// Create an instance of your task
		Runnable task1 = new MyRunnableTask("Task 1");
		Runnable task2 = new MyRunnableTask("Task 2");

		// Create new Threads and pass the Runnable tasks to them
		Thread thread1 = new Thread(task1, "Worker-Thread-1");
		Thread thread2 = new Thread(task2, "Worker-Thread-2");

		// Start the threads
		thread1.start();
		thread2.start();
	}

}
