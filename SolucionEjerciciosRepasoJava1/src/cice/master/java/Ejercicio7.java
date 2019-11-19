package cice.master.java;

import java.util.Scanner;

public class Ejercicio7 {

	static Scanner teclado;
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		double[] primero = getArray(5);
		double[] segundo = getArray(5);
		teclado.close();
		if (sonArraysIguales(primero, segundo)) {
			System.out.println("Los arrays son iguales");
		} else {
			System.out.println("Los arrays son distintos");
		}
	}

	static double[] getArray(int dimension) {
		double[] numeros = new double[dimension];		
		for (int i = 0; i < dimension; i++) {
			numeros[i] = pedirNumeroReal();
		}
		return numeros;
	}
	
	static double pedirNumeroReal() {
		double numero = 0.0;
		while (numero == 0.0) {
			try {
				System.out.print("Numero: ");
				String valor = teclado.nextLine();
				numero = Double.parseDouble(valor);
			} catch (Exception e) {
				numero = 0.0;
			}
		}
		return numero;
	}
	
	static boolean sonArraysIguales(double[] primero, double[] segundo) {
		boolean sonIguales = true;
		if (primero.length != segundo.length) {
			return false;
		}
		for (int k = 0; k < primero.length; k++) {
			if (primero[k] != segundo[k]) {
				sonIguales = false;
				break;
			}
		}
		return sonIguales;
	}
	
}
