/**
 * 
 */
package com.mx.kalqui.threads;

/**
 * @author Karina Creación y ejecución de hilos con expresiones lambda.
 * 
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(() -> {
			// work
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
			}
		});
		t.start();
		t.join(); // wait for completion
	}

}
