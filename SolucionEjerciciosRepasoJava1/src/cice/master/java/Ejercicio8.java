package cice.master.java;

public class Ejercicio8 {

	public static void main(String[] args) {
		Rectangulo primero = new Rectangulo(11.1, 12.3);
		Rectangulo segundo = new Rectangulo();
		segundo.base = 26.0;
		segundo.altura = 4.0;
		System.out.println("Area primer rect�ngulo: " + primero.area());
		System.out.println("Per�metro primer rect�ngulo: " + primero.perimetro());
		System.out.println("Area segundo rect�ngulo: " + segundo.area());
		System.out.println("Per�metro segundo rect�ngulo: " + segundo.perimetro());
	}

}
