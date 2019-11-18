package master.java;

import java.util.HashMap;
import java.util.HashSet;

//CONJUNTOS HashSet los conjuntos no admiten valores repetidos
public class Ejemplo3 {

	public static void main(String[]a) {
	HashSet<Integer> n = new HashSet<Integer>();
	n.add(1);
	n.add(1);
	n.add(12);
	n.add(13);
	n.add(11);
	n.add(11);
	for (Integer x:n) {
		System.out.println(x);
	}
	//COLECCIONES MAPAS O DICCIONARIOS
	HashMap<Integer,String> mapa= new HashMap<Integer,String>();
	mapa.put(1, "Lucas");  //( clave, valor) deben de ser objetos no se admiten datos primitivos
	mapa.put(2, "Lucia");
	mapa.put(1, "maria");  //renombra el primer mapa (mapa.put(1,"Lucas")
	}
}
