package cice.master.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca un numero: ");
			valores[i] = teclado.nextInt();
		}
		teclado.close();
		for (int i = 0; i < valores.length - 1; i++) {
			for (int k = i + 1; k < valores.length; k++) {
				if (valores[i] < valores[k]) {
					int menor = valores[i];
					valores[i] = valores[k];
					valores[k] = menor;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(valores[i]);
		}
	}

}
