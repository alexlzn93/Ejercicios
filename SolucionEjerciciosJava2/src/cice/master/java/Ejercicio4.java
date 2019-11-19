package cice.master.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero con decimales: ");
		String numero = teclado.nextLine();
		System.out.print("Decimales a redondear: ");
		int decimales = teclado.nextInt();
		teclado.close();
		int posicion = numero.indexOf(".");		
		if (posicion != -1) {
			String parteEntera = numero.substring(0, posicion);
			String parteDecimal = numero.substring(posicion + 1);
			if (parteDecimal.length() >= decimales) {
				parteDecimal = parteDecimal.substring(0, decimales);
			}
			String ultimoDigito = "" + parteDecimal.charAt(parteDecimal.length() - 1);
			int valorDigito = Integer.parseInt(ultimoDigito);
			if (valorDigito >= 5) {
				valorDigito++;
			}
			parteDecimal = parteDecimal.substring(0, parteDecimal.length() - 1) + valorDigito;
			System.out.println(numero);
			System.out.println(parteEntera + "." + parteDecimal);
		} else {
			System.out.println("Numero sin decimales, no se puede redondear los decimales");
		}
	}

}
