/**
 * 
 */
package com.mx.kalqui.threads;

/**
 * @author karin
 */
// Define a task by extending the Thread class
public class MyThreadTask extends Thread {

	private String taskName;

	public MyThreadTask(String taskName) {
		super(taskName);// Set thread name
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " starting: " + taskName);
		try {
			// Simulate some work
			Thread.sleep(150);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(Thread.currentThread().getName() + " was interrupted.");
		}
		System.out.println(Thread.currentThread().getName() + " finished " + taskName);
	}

}
