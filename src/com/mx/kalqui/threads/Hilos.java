/**
 * 
 */
package com.mx.kalqui.threads;

import java.util.Scanner;

/**
 * @author Karina
 */
public class Hilos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un número: ");
		double num = sc.nextDouble();

		Raiz tarea1 = new Raiz(num);
		Potencia tarea2 = new Potencia(num);

		tarea1.start();
		tarea2.start();
	}

}
