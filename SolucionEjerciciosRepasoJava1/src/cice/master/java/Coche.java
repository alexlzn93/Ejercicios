package cice.master.java;

public class Coche {

	private String color;
	private String marca;
	private String modelo;
	private double caballos;
	private int puertas;
	private String matricula;

	public Coche() {
		color = "";
		marca = "";
		modelo = "";
		caballos = 0.0;
		puertas = 0;
		matricula = "";
	}

	public Coche(String color, String marca, String modelo, double caballos, int puertas, String matricula) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.caballos = caballos;
		this.puertas = puertas;
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
}
