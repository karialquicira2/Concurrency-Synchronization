/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author Karina
 * 
 */
public class EjemploCola {

	public static void main(String[] args) {

		// Se define una cola con capacidad máxima de 3 elementos
		BlockingQueue<Integer> cola = new LinkedBlockingDeque<Integer>(3);

		// Hilo Productor
		Thread productor = new Thread(() -> {
			try {
				for (int i = 0; i <= 5; i++) {
					cola.put(i); // Bloquea el hilo si la cola se llena.
					System.out.println("Producido: " + i);
					Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});

		// Hilo consumidor
		Thread consumidor = new Thread(() -> {
			try {
				for (int i = 0; i <= 5; i++) {
					Integer valor = cola.take();// Bloquea el hilo si la cola está vacía.
					System.out.println("Consumido: " + valor);
					Thread.sleep(800); // EL consumidor es màs lento deliberadamente.
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});

		productor.start();
		consumidor.start();
	}

}
