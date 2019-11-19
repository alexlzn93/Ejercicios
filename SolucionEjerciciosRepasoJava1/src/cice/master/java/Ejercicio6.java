package cice.master.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = getArray(100);
		System.out.print("Número a buscar: ");
		int numero = teclado.nextInt();
		teclado.close();
		int posicion = getPosicion(numero, numeros);
		if (posicion != -1) {
			System.out.println("Número está en la posición del array: " + posicion);
		} else {
			System.out.println("El número no se encuentra dentro del array"); 
		}
	}

	static int[] getArray(int dimension) {
		int[] numeros = new int[dimension];
		for (int i = 0; i < dimension; i++) {
			numeros[i] = (int)(Math.random() * 100 + 1);
		}
		return numeros;
	}
	
	static int getPosicion(int numero, int[] array) {
		int posicion = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
}
