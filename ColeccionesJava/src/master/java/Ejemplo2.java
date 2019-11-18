package master.java;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce texto:");
		String texto = entrada.nextLine();
		entrada.close();
		//crear array list en funcion de las palabras que hayamos introducido en la cadena de texto
		ArrayList<String> palabras= new ArrayList<String>();  //coleccion de tipo String 
		for(String palabra: texto.split(" ")){
			palabras.add(palabra);
		}
		for (String palabra:palabras) {
			System.out.println(palabra);
		}
		//palabras que no esten repetidas del texto que se pide por entrada ej. es 
		ArrayList<String> norepetidas= new ArrayList<String>();
		for(String palabra:palabras) {
			if(norepetidas.contains(palabras)==false) {  //comprueba si la palabrata dentro de la coleccion
				norepetidas.add(palabra);
			}
		}
		
	}

}
