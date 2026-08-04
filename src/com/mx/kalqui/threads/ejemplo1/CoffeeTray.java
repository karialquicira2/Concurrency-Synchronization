/**
 * 
 */
package com.mx.kalqui.threads.ejemplo1;

/**
 * @author Karina
 */
public class CoffeeTray {

	private int coffeeCount = 0;
	private final int MAX_CAPACITY = 10;

	public synchronized void addCoffee() throws InterruptedException {
		while (coffeeCount >= MAX_CAPACITY) {
			wait();// Espera si la bandeja está llena.
		}
		coffeeCount++;
		System.out.println("Un productor añadió una taza de café. Tazas en la bandeja: " + coffeeCount);
		notify(); // Notifica al consumidor.
	}

	public synchronized void takeCoffee() throws InterruptedException {
		while (coffeeCount == 0) {
			wait();// Espera si la bandeja está vacía.
		}
		coffeeCount--;
		System.out.println("Un consumidor tomó una taza de café. Tazas restantes: " + coffeeCount);
		notify();// Notifica al productor.
	}

}
