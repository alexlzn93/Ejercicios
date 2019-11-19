package cice.master.java;

import java.util.Scanner;

public class Ejercicio3 {

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
		int[][] invertidos = new int[filas][columnas];
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				invertidos[f][c] = numeros[f][columnas - c - 1];
			}	
		}
		// Valores del primer array
		System.out.println("Valores del primer array");
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				System.out.print(numeros[f][c] + " ");
			}	
			System.out.println();
		}
		System.out.println("---------------------------------");
		System.out.println("Valores del array invertido");
		// Valores del array invertido
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				System.out.print(invertidos[f][c] + " ");
			}	
			System.out.println();
		}
	}

	static int pedirNumeroPorTeclado() {
		int numero = 0;
		while (numero == 0) {
			try {
				String valor = teclado.nextLine();
				numero = Integer.parseInt(valor);
				break;
			} catch (Exception e) {
				numero = 0;
			}
		}
		return numero;
	}
	
}
