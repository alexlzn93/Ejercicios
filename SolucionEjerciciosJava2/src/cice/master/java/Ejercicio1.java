package cice.master.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un texto: ");
		String texto = teclado.nextLine();
		teclado.close();
		int vocalesA = 0;
		int vocalesE = 0;
		int vocalesI = 0;
		int vocalesO = 0;
		int vocalesU = 0;
		texto = texto.toLowerCase();
		for (int posi = 0; posi < texto.length(); posi++) {
			char letra = texto.charAt(posi);
			switch(letra) {
			case 'a':
				vocalesA++;
				break;
			case 'e':
				vocalesE++;
				break;
			case 'i':
				vocalesI++;
				break;
			case 'o':
				vocalesO++;
				break;
			case 'u':
				vocalesU++;
			}
		}
		System.out.println("Numero de vocales 'a': " + vocalesA);
		System.out.println("Numero de vocales 'e': " + vocalesE);
		System.out.println("Numero de vocales 'i': " + vocalesI);
		System.out.println("Numero de vocales 'o': " + vocalesO);
		System.out.println("Numero de vocales 'u': " + vocalesU);
	}

}
