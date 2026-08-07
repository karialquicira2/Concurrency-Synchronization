/**
 * 
 */
package com.mx.kalqui.threads;

/**
 * @author Karina
 */

class Counter1 implements Runnable {

	private int valor;

	public Counter1(int valor) {
		this.valor = valor;
	}

	@Override
	public void run() {
		System.out.printf("Estado %s \n", Thread.currentThread().getState());
		for (int i = valor; i >= 0; i--) {
			System.out.printf("%s Valor %d \n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class Devs4jCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread hilo1 = new Thread(new Counter1(10), "Hilo 1");
		System.out.printf("Estado %s \n", hilo1.getState());
		hilo1.start();
		hilo1.join();
		System.out.printf("Estado %s \n", hilo1.getState());
	}

}
