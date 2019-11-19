package cice.master.java;

public class Tiempo {

	private int hora;
	private int minutos;
	private int segundos;

	public Tiempo(int hora) {
		this(hora, 0);
	}

	public Tiempo(int hora, int minutos) {
		this(hora, minutos, 0);
	}

	public Tiempo(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

}
