package cice.master.java;

import java.util.Scanner;

public class Ejercicio4 {

	static Scanner teclado;
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Edad: ");
		int edad = pedirNumeroEntero();
		if (edad > 17) {
			System.out.print("Salario: ");
			double salario = pedirNumeroReal();
			salario = getSalario(edad, salario);
			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);
			System.out.println("Salario: " + salario);
		} else {
			System.out.println("Es un menor de edad");
		}
		teclado.close();
	}

	static int pedirNumeroEntero() {
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
	
	static double pedirNumeroReal() {
		double numero = 0.0;
		while (numero == 0.0) {
			try {
				String valor = teclado.nextLine();
				numero = Double.parseDouble(valor);
			} catch (Exception e) {
				numero = 0.0;
			}
		}
		return numero;
	}
	
	static double getSalario(int edad, double salario) {
		double valor = 0;
		if ((edad > 18) && (edad < 51)) {
			valor = salario + (salario * 5 / 100);
		} else if ((edad > 50) && (edad < 61)) {
			valor = salario + (salario * 10 / 100);
		} else if (edad > 60) {
			valor = salario + (salario * 15 / 100);
		} else if (edad == 18) {
			valor = salario;
		}
		return valor;
	}
}
