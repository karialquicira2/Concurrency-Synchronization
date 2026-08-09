/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

import java.util.Random;

/**
 * @author Karina
 * 
 */
public class Devs4jProducer extends Thread {

	private Devs4jResource resource;

	public Devs4jProducer(Devs4jResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				int value = new Random().nextInt(300);
				System.out.printf("%s produced %d \n", getName(), value);
				resource.produce(value);
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
