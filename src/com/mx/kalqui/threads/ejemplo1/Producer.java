/**
 * 
 */
package com.mx.kalqui.threads.ejemplo1;

/**
 * @author Karina
 */
public class Producer implements Runnable {

	private CoffeeTray tray;

	public Producer(CoffeeTray tray) {
		this.tray = tray;
	}

	@Override
	public void run() {
		try {
			while (true) {
				tray.addCoffee();
				Thread.sleep(1000); // Simula el tiempo de producción.
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

}
