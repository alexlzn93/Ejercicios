package cice.master.java;

public class Ejercicio10 {

	public static void main(String[] args) {
		Tiempo hora = new Tiempo(12);
		hora.setMinutos(20);
		hora.setSegundos(30);
		String horaCad = hora.getHora() + ":" + hora.getMinutos() + ":" + hora.getSegundos();
		System.out.println("Hora: " + horaCad);
	}

}
