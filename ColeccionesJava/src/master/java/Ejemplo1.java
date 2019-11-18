package master.java;

import java.util.ArrayList;
import java.util.List;
import cice.master.java.ficheros.Fichero;

public class Ejemplo1 {

	public static void procesarListas() {
		
	
	ArrayList lista= new ArrayList(); //Todo los elementos son de tipo Objects
	lista.add(5);
	lista.add("lucas");
	lista.add(123.78);
	lista.add((byte) 7);
	for(Object elemento: lista) {
		if (elemento instanceof Integer) {
			Integer n=(Integer)elemento;
			System.out.println(n + "Es un Integer");
		}
		if(elemento instanceof Integer) {
			String n=(String)elemento;
			System.out.println(n + "Es un String");
		}
		if(elemento instanceof Double) {
			Double n=(Double)elemento;
			System.out.println(n + "Es un Double");
		}
		if(elemento instanceof Byte) {
			Byte n=(Byte)elemento;
			System.out.println(n + "Es un Byte");
		}
			
	}
	}
	public static void procesarListasConTipo() {
		ArrayList<Float> enteros =new ArrayList <Float>(); //la coleccion solo admiten Objetos ej:Integer,Float,Double,String...
		enteros.add(8.3F);
		enteros.add(89.21F);
		enteros.add(28.9F);
		enteros.add(45.3F);
		enteros.add(812.65F);
		for (int indice=0; indice<enteros.size();indice++) {
			System.out.println(enteros.get(indice));
		}
		for (Float elemento:enteros) {  //Bucle for-each
			System.out.println(elemento);
		}
		enteros.forEach(x->System.out.println(x));
		//enteros.add("Lucas");
		//enteros.add(123.78);
	}
	public static void procesarArchivoTexto(){
		String nombreArchivo="I:\\Proyectos\\datasets\\usuarios.txt";
		List<String> textoArchivo=Fichero.leerTextoArchivoLista(nombreArchivo);
		for (String linea: textoArchivo) {
			System.out.println(linea);
		}
	}
	public static void procesarTexto() {
		String nombreArchivo="I:\\Proyectos\\datasets\\montecristo.txt";
		String texto=Fichero.leerTextoArchivo(nombreArchivo);
		ArrayList<String> palabras= new ArrayList<String>();
		for (String palabra : texto.split(" ,;:-\\")){
			palabras.add(palabra);
		ArrayList<Integer> caracteres= new ArrayList<Integer>();
		for (String palabrita: palabras) {
			caracteres.add(palabrita.length());
		}
	
		}
	}
	
	
}
