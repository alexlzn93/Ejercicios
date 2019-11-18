package cice.master.java.clases;

public abstract class Empleado extends Persona {
	
	public double sueldo;
	public String nif;
	
	public Empleado() {
		this(IBase.SIN_NOMBRE, 0, 0);
	}

	public Empleado(String nombre, int edad, int dni) {
		this(nombre, edad, dni, 0.0);
	}
	
	public Empleado(String nombre, int edad, int dni, double sueldo) {
		super(nombre, edad, dni);
		this.nif = (dni != 0) ? getNIF() : IBase.SIN_NIF;
		this.sueldo = sueldo;
	}

	public Empleado(Persona persona) {
		this(persona, 0.0);
	}
	
	public Empleado(Persona persona, double sueldo) {
		this(persona.nombre, persona.edad, persona.dni, sueldo);
	}
	
	private String getNIF() {
		return String.valueOf(dni) + "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
	}
	
	public abstract double getSueldo();
	
	@Override
	public String toString() {
		return nombre + ";" + edad + ";" + dni + ";" + nif + ";" + sueldo;
	}
	
}
