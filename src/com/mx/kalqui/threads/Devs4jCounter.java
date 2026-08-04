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
	public static void main(String[] args) {
		Thread hilo1 = new Thread(new Counter1(10), "Hilo 1");
		hilo1.start();

		Thread hilo2 = new Thread(new Counter1(20), "Hilo 2");
		hilo2.start();
	}

}
