package cice.master.java;

import java.util.Scanner;

public class Ejercicio2 {

	static Scanner teclado;
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.print("Numero de filas: ");
		int filas = pedirNumeroPorTeclado();
		System.out.print("Numero de columnas: ");
		int columnas = pedirNumeroPorTeclado();
		teclado.close();
		int[][] numeros = new int[filas][columnas];
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				numeros[f][c] = (int)(Math.random() * 100 + 1);
			}	
		}
		int[] impares = new int[filas];
		int[] repetidos = new int[filas];
		for (int f = 0; f < filas; f++) {
			impares[f] = 0;
			repetidos[f] = getRepetidos(numeros[f]);
			for (int c = 0; c < columnas; c++) {
				if (numeros[f][c] % 2 == 1) {
					impares[f]++;
				}
			}	
		}
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				System.out.print(numeros[f][c] + " ");
			}	
			System.out.println();
		}
		for (int f = 0; f < filas; f++) {
			System.out.println("Fila: " + f + " Impares: " + impares[f]);
		}
		for (int f = 0; f < filas; f++) {
			System.out.println("Fila: " + f + " Repetidos: " + repetidos[f]);
		}
	}

	static int pedirNumeroPorTeclado() {
		int numero = 0;
		while (numero == 0) {
			try {
				String valor = teclado.nextLine();
				numero = Integer.parseInt(valor);
			} catch (Exception e) {
				numero = 0;
			}
		}
		return numero;
	}
	
	static int getRepetidos(int[] array) {
		int[] numeros = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			numeros[i] = 0;
			for (int k = 0; k < array.length; k++) {
				if (array[i] == array[k]) {
					numeros[i]++;
				}
			}	
		}
		int repetidos = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 1) repetidos++;
		}
		return repetidos;
	}
	
}
