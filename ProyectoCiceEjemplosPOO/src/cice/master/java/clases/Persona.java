package cice.master.java.clases;

public class Persona {

	public String nombre;
	public int edad;
	public int dni;
		
	public Persona() {
		this(IBase.SIN_NOMBRE, 0, 0);  // a este constructor le estoy metiendo un parametro que es una interfaz que contiene dos constantes
	}

	public Persona(String nombre, int edad, int dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return nombre + ";" + edad + ";" + dni;
	}
	
}
