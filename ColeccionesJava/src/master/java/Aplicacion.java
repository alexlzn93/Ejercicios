package master.java;

import cice.master.java.cadenas.Cadenas;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IOperacion opera= new Mates();
		System.out.println(opera.cubo(8));
		System.out.println(opera.cubo(8));
		Ejemplo1.procesarArchivoTexto();
	
		
	}

}
