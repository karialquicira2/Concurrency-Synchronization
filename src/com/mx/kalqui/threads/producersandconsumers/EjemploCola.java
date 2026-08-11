/**
 * 
 */
package com.mx.kalqui.threads.producersandconsumers;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Karina
 * 
 */
public class EjemploCola {

	public static void main(String[] args) {

		int capacity = 5;
		// Se define una cola con capacidad máxima de 3 elementos
		BlockingQueue<Integer> cola = new ArrayBlockingQueue<>(capacity);

		// Hilo Productor
		Thread productor = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {
					System.out.println("Producer adding: " + i);
					cola.put(i); // Bloquea el hilo si la cola se llena.
					Thread.sleep(100);
				}
				cola.put(-1);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});

		// Hilo consumidor
		Thread consumidor = new Thread(() -> {
			try {
				int value;
				while ((value = cola.take()) != -1) {
					System.out.println("Consumer consumed: " + value);
					Thread.sleep(200);
				}
				System.out.println("Consumer finished.");
//				for (int i = 0; i <= 5; i++) {
//					Integer valor = cola.take();// Bloquea el hilo si la cola está vacía.
//					System.out.println("Consumido: " + valor);
//					Thread.sleep(800); // EL consumidor es màs lento deliberadamente.
//				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});

		productor.start();
		consumidor.start();
	}

}
