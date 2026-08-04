/**
 * 
 */
package com.mx.kalqui.threads.ejemplo1;

/**
 * 
 */
public class Consumer implements Runnable {

	private CoffeeTray tray;

	public Consumer(CoffeeTray tray) {
		this.tray = tray;
	}

	@Override
	public void run() {
		try {
			while (true) {
				tray.takeCoffee();
				Thread.sleep(1500); // Simula el tiempo de consumo.
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

}
