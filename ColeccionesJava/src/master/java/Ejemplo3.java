package master.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//CONJUNTOS HashSet los conjuntos no admiten valores repetidos
public class Ejemplo3 {

	/*public static void main(String[]a) {
	HashSet<Integer> n = new HashSet<Integer>();
	n.add(1);
	n.add(1);
	n.add(12);    //este tiene 3 elementos porque los hashset no admiten valores repetidos y los elimina
	n.add(13);
	n.add(11);
	n.add(11);
	for (Integer x:n) {   //bucle for each
		System.out.println(x);
	}*/
	
	public static void main(String[]a) {
		HashSet<String> nombres= new HashSet<String>();
			nombres.add("Antonio");
			nombres.add("Marta");
			nombres.add("Miguel");
			nombres.add("Alonso");
			nombres.add("Marcelo");
			nombres.add("Jose");
			nombres.add("Maria");
			eliminarElemento(nombres, "s");
			for (String n:nombres) {  //no tenemos posibilidad de modificar los elementos de la coleccion
				System.out.println(n);
			}
		}
	
		
	static void eliminarElemento(HashSet<String> lista,String condicion) {
		Iterator<String> iterador=lista.iterator();  //
		while(iterador.hasNext()) {  //hasNext comprueba si hay elementos
			String nombre= iterador.next();//next se movera por los elementos
	        if (nombre.contains(condicion)) {  //recorre la coleccion y elimina los nombres que contengan la letra s (eliminarElemento "s")
	        	iterador.remove();
	        }
		}
	
	
	
	}
}
