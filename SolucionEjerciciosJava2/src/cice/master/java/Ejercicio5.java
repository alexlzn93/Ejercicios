package cice.master.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero: ");
		int numero = teclado.nextInt();
		teclado.close();
		String[] numeros = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
		String[] numero10 = { "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve" }; 
		String[] decenas = { "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa" };
		if (numero > 99) {
			System.out.println("El número debe de estar comprendido entre 0 y 99");
		} else if (numero < 10) {
			System.out.println(numeros[numero]);
		} else if ((numero > 10) && (numero < 20)) {
			System.out.println(numero10[numero - 11]);
		} else if (numero % 10 == 0) {
			System.out.println(decenas[numero / 10 - 1]);
		} else {
			System.out.println(decenas[numero / 10 - 1] + " y " + numeros[numero % 10]);
		}
	}

}
