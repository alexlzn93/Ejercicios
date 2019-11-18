package cice.master.java.empleados;

import cice.master.java.clases.Empleado;
import cice.master.java.clases.IBase;
import cice.master.java.clases.IComision;
import cice.master.java.clases.Persona;

public class Vendedor extends Empleado implements IComision {

	public double comision;
	
	public Vendedor() {
		this(IBase.SIN_NOMBRE, 0, 0);
	}
	
	public Vendedor(String nombre, int edad, int dni) {
		this(nombre, edad, dni, 0.0);
	}
	
	public Vendedor(String nombre, int edad, int dni, double sueldo) {
		this(nombre, edad, dni, sueldo, 0.0);
	}
	
	public Vendedor(String nombre, int edad, int dni, double sueldo, double comision) {
		super(nombre, edad, dni, sueldo);
		this.comision = comision;
	}
	
	public Vendedor(Persona persona) {
		this(persona, 0.0, 0.0);
	}
	
	public Vendedor(Persona persona, double sueldo) {
		this(persona, sueldo, 0.0);
	}
	
	public Vendedor(Persona persona, double sueldo, double comision) {
		this(persona.nombre, persona.edad, persona.dni, sueldo, comision);
	}
	
	@Override
	public double getComision() {
		return comision;
	}

	@Override
	public double getSueldo() {
		return sueldo + (sueldo * comision / 100.0);
	}

	@Override
	public String toString() {
		return nombre + ";" + edad + ";" + dni + ";" + nif + ";" + sueldo + ";" + comision;
	}
	
}
