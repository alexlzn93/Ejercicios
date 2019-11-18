package master.java;

import java.util.ArrayList;
import java.util.Scanner;
//todos los arrays hay que especificarle el tipo que va tener en su interior

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
			if(norepetidas.contains(palabras)==false) {  //comprueba si la palabra esta dentro de la coleccion
				norepetidas.add(palabra);
			}
		}
		ArrayList<String> nombres = new ArrayList<String>();  //todos los arrays su primer elemento siempre empieza en 0
		nombres.add("jose"); //posicion 0
		nombres.add("ana"); //posicion 1
		nombres.add("maria"); //posicion 2
		nombres.add("jose"); //posicion 3
		nombres.add("ana");  //posicion 4
		String elimina=nombres.remove(2);  //elimina maria (posicion 2) //String porq el arraylist es de tipo String y devuelve ese dato
		nombres.remove("jose"); 
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(5);
		n.add(15);
		n.add(25);
		n.add(35);
		if (n.contains(55)) {  //Contains te dice si ese elemento esta dentro del ArrayList y devuelve un dato boolean
			System.out.println("Elemento existente");
		}else {
			n.add(55);
		}
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(6);
		x.addAll(n);
		if (x.indexOf(6) !=-1) {  //Busca el objeto especificado y devuelve el índice de base cero de la primera aparición en toda la colección ArrayList.
			
		}
	}
	

}
