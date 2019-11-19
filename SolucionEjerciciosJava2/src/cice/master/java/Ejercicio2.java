package cice.master.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Día de semana: ");
		int diaSemana = teclado.nextInt();
		System.out.print("Día del mes: ");
		int diaMes = teclado.nextInt();
		System.out.print("Número de mes: ");
		int mes = teclado.nextInt();
		System.out.print("Año: ");
		int anho = teclado.nextInt();
		teclado.close();
		String[] nombreDia = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		String[] nombreMes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		System.out.println(nombreDia[diaSemana - 1] + ", día " + diaMes + " de " + nombreMes[mes - 1] + " del " + anho);
	}

}
