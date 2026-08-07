/**
 * 
 */
package com.mx.kalqui.threads.ejemplo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Karina
 * 
 */
public class BuscarPalabra implements Runnable {

	private String palabra;
	private Thread hilo;
	private int cant;

	public BuscarPalabra(String palabra) {
		this.palabra = palabra;
		hilo = new Thread(this);
		hilo.start();
		while (hilo.isAlive())
			;
		System.out.println("La palabra " + palabra + " se encuentra en: " + cant + " archivos.");

	}

	@Override
	public void run() {
		File ar = new File("C:\\Users\\Karina\\Documents\\Software");
		String[] directorio = ar.list();
		for (String arch : directorio) {
			if (tiene(arch)) {
				cant++;
			}
		}
	}

	private synchronized boolean tiene(String archivo) {
		boolean existe = false;
		try {
			FileReader fr = new FileReader("C:\\Users\\Karina\\Documents\\Software" + archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				if (linea.indexOf(palabra) != -1)
					existe = true;
				linea = br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		return existe;
	}

	public static void main(String[] args) {
		new BuscarPalabra("rojo");
		new BuscarPalabra("verde");
	}

}
