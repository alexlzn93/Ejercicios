package cice.master.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Primer numero: ");
		int primero = teclado.nextInt();
		System.out.print("Segundo numero: ");
		int segundo = teclado.nextInt();
		System.out.print("Operador aritmético: ");
		String operador = teclado.nextLine();
		teclado.close();
		int resultado = 0;
		if (operador.equals("+")) {
			resultado = suma(primero, segundo);
		} else if (operador.equals("-")) {
			resultado = resta(primero, segundo);
		} else if (operador.equals("*")) {
			resultado = multiplicacion(primero, segundo);
		} else if (operador.equals("/")) {
			resultado = division(primero, segundo);
		} else if (operador.equals("%")) {
			resultado = resto(primero, segundo);
		} else if (operador.equals("^")) {
			resultado = elevar(primero, segundo);
		} else {
			System.out.println("Operación no permitida.");
		}
		System.out.println("Resultado: " + resultado);
	}

	static int suma(int primero, int segundo) {
		return primero + segundo;
	}
	
	static int resta(int primero, int segundo) {
		return primero - segundo;
	}
	
	static int multiplicacion(int primero, int segundo) {
		return primero * segundo;
	}
	
	static int division(int primero, int segundo) {
		return primero / segundo;
	}
	
	static int resto(int primero, int segundo) {
		return primero % segundo;
	}
	
	static int elevar(int primero, int segundo) {
		return (int)Math.pow(primero, segundo);
	}
	
}
