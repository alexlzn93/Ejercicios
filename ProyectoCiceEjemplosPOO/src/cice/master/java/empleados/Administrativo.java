package cice.master.java.empleados;

import cice.master.java.clases.Empleado;
import cice.master.java.clases.Persona;

public class Administrativo extends Empleado {

	public Administrativo() {
		super();
	}
	
	public Administrativo(String nombre, int edad, int dni) {
		super(nombre, edad, dni);
	}
	
	public Administrativo(String nombre, int edad, int dni, double sueldo) {
		super(nombre, edad, dni, sueldo);
	}

	public Administrativo(Persona persona) {
		super(persona);
	}
	
	public Administrativo(Persona persona, double sueldo) {
		super(persona, sueldo);
	}
	
	@Override
	public double getSueldo() {
		return sueldo;
	}
	
}
