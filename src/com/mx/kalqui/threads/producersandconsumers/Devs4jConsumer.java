/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

import java.util.Random;

/**
 * @author Karina
 * 
 */
public class Devs4jConsumer extends Thread {

	private Devs4jResource resource;

	public Devs4jConsumer(Devs4jResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				int value = resource.consume();
				System.out.printf("%s consumed %d \n", getName(), value);
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
