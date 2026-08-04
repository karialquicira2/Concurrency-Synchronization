/**
 * @author Karina
 */
package com.mx.kalqui.threads;

/**
 * 
 */
public class Potencia extends Thread {

	double numero;

	public Potencia(double numero) {
		this.numero = numero;
	}

	@Override
	public void run() {
		Double resultado = Math.pow(this.numero, 2);
		System.out.println("Potencia: " + resultado);
	}

}
