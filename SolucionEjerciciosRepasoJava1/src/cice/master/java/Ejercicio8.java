package cice.master.java;

public class Ejercicio8 {

	public static void main(String[] args) {
		Rectangulo primero = new Rectangulo(11.1, 12.3);
		Rectangulo segundo = new Rectangulo();
		segundo.base = 26.0;
		segundo.altura = 4.0;
		System.out.println("Area primer rectángulo: " + primero.area());
		System.out.println("Perímetro primer rectángulo: " + primero.perimetro());
		System.out.println("Area segundo rectángulo: " + segundo.area());
		System.out.println("Perímetro segundo rectángulo: " + segundo.perimetro());
	}

}
