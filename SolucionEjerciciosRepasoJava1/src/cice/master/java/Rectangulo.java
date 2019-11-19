package cice.master.java;

public class Rectangulo {

	public double base;
	public double altura;
	
	public Rectangulo() {
		this(0.0, 0.0);
	}
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		return base * altura;
	}
	
	public double perimetro() {
		return (base + altura) * 2.0;
	}
	
}
