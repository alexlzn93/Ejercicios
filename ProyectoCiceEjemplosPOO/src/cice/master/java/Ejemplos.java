package cice.master.java;

import cice.master.java.clases.Persona;
import cice.master.java.clientes.Cliente;
import cice.master.java.empleados.Administrativo;
import cice.master.java.empleados.Vendedor;

public class Ejemplos {

	public static void main(String[] args) {
		Persona personaJose = new Persona("Jose", 27, 23290256);
		Persona personaMartin = new Persona("Martin", 42, 12334458);
		Administrativo adminJose = new Administrativo(personaJose, 1200);
		Vendedor vendedorMartin = new Vendedor(personaMartin, 920, 2.4);
		Vendedor vendedorPersona = new Vendedor(new Persona());
		Cliente clienteJuan = new Cliente("Juan Antonio", 31, 43234765);
		System.out.println(adminJose);
		System.out.println(vendedorMartin);
		System.out.println(vendedorPersona);
		System.out.println(clienteJuan);
	}

}
