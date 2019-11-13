package curso;

import curso.usuario.Persona;

public class Aplicacion {

	public static void main(String[] a) {
		Persona persona = new Persona();
		persona.nombre = "Manuel";
		persona.edad = 19;

		Persona persona2 = new Persona();
		persona2.nombre = "Ana";
		persona2.edad = 24;

		Persona maria = new Persona("Maria");
		System.out.println(maria.nombre);
		System.out.println(maria.edad);

		Persona lucas = new Persona("Lucas", 34);
		System.out.println(lucas.nombre);
		System.out.println(lucas.edad);

	}

}
