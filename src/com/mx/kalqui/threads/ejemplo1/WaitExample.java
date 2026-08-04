/**
 * 
 */
package com.mx.kalqui.threads.ejemplo1;

/**
 * @author Karina
 */
public class WaitExample {

	public static void main(String[] args) {

		CoffeeTray tray = new CoffeeTray();
		Thread producerThread = new Thread(new Producer(tray));
		Thread consumerThread = new Thread(new Consumer(tray));

		producerThread.start();
		consumerThread.start();

	}

}
