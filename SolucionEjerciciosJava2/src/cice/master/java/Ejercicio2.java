package cice.master.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("D�a de semana: ");
		int diaSemana = teclado.nextInt();
		System.out.print("D�a del mes: ");
		int diaMes = teclado.nextInt();
		System.out.print("N�mero de mes: ");
		int mes = teclado.nextInt();
		System.out.print("A�o: ");
		int anho = teclado.nextInt();
		teclado.close();
		String[] nombreDia = { "Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "S�bado", "Domingo" };
		String[] nombreMes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		System.out.println(nombreDia[diaSemana - 1] + ", d�a " + diaMes + " de " + nombreMes[mes - 1] + " del " + anho);
	}

}
