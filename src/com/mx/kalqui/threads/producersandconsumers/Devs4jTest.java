/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

/**
 * @author Karina
 * 
 */
public class Devs4jTest {

	public static void main(String[] args) throws InterruptedException {

		Devs4jResource resource = new Devs4jResource();
		Devs4jConsumer consumer1 = new Devs4jConsumer(resource, "Consumer1");
		Devs4jConsumer consumer2 = new Devs4jConsumer(resource, "Consumer2");

		Devs4jProducer producer1 = new Devs4jProducer(resource, "Producer1");
		Devs4jProducer producer2 = new Devs4jProducer(resource, "Producer2");

		producer1.start();
		producer2.start();
		consumer1.start();
		consumer2.start();

	}

}
