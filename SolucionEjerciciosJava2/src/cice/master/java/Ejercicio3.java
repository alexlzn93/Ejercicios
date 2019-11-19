package cice.master.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un nombre: ");
		String nombre = teclado.nextLine();
		teclado.close();
		String[] datos = nombre.toLowerCase().split(" ");
		for (int i = 0; i < datos.length; i++) {
			datos[i] = datos[i].toUpperCase().charAt(0) + datos[i].substring(1);
		}
		System.out.println(datos[1] + " " + datos[2] + ", " + datos[0]);
	}

}
