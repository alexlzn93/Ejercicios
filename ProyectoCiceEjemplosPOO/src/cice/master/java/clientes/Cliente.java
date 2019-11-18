 package cice.master.java.clientes;

import cice.master.java.clases.Persona;

public class Cliente extends Persona {

	public Cliente() {
		super();
	}
	
	public Cliente(String nombre, int edad, int dni) {
		super(nombre, edad, dni);
	}
	
	public Cliente(Persona persona) {
		super(persona.nombre, persona.edad, persona.dni);
	}
	
}
