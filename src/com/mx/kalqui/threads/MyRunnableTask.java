/**
 * 
 */
package com.mx.kalqui.threads;

/**
 * @author
 */
// Define a task by implementing the Runnable interface.
public class MyRunnableTask implements Runnable {

	private String taskName;

	public MyRunnableTask(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " starting: " + taskName);
		try {
			// Simulate some work
			Thread.sleep(100);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName() + " was interrupted.");
		}
		System.out.println(Thread.currentThread().getName() + " finished " + taskName);
	}

}
