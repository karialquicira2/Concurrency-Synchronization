/**
 * 
 */
package com.mx.kalqui.threads;

/**
 * @author Karina
 * 
 */
public class Devs4jThread extends Thread {

	public Devs4jThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("Hilo %s indice %d \n", getName(), i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ConstruccionDeHilos {

	public static void main(String[] args) {
		Devs4jThread hilo1 = new Devs4jThread("Hilo 1");
		Devs4jThread hilo2 = new Devs4jThread("Hilo 2");

		hilo1.start();
		hilo2.start();
	}

}
