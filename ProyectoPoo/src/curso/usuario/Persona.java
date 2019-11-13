package curso.usuario;
//Esta clase es la platilla de aplicacion
public class Persona {

	public String nombre;
	 public int edad;
	
	public Persona() {
		nombre= "";
		edad=0;
	}
	
	public Persona(String n) {   //(lo que esta entre parentesis son los parametros en este caso String)
		nombre=n;
		edad=0;
		
	}
	
	public Persona(String n, int e) {
		nombre=n;
		edad= e;
	}
}
