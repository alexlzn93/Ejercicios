package master.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio4 {

	//COLECCIONES MAPAS O DICCIONARIOS
	public static void main(String[]args) {
		HashMap<String,Integer> equipos= new HashMap<String,Integer>();
		equipos.put("Athletic de Bilbao",1929);
		equipos.put("Racing Santander",1950);
		equipos.put("Barcelona",1941);
		equipos.put("Deportivo",1953);
		
		HashMap<Integer ,Equipo> equi= new HashMap<Integer,Equipo>(); //la clave y el valor siempre son instancias de clase no valores de tipo primitivo
	    //clave(Integer)  //valor(Equipo)
		equi.put(1,new Equipo("Racing Santander", "Santander")); //el 1 se refiere a la clave
	    Equipo valor= equi.get(1);
	    valor.nombre= "Mineros de Guayana";
	    valor.ciudad= "Guayana";
		equi.put(1, valor);
		
	//FOR EACH
	for (Map.Entry<Integer,Equipo>elemento: equi.entrySet()) {
		System.out.println("Clave:" + elemento.getKey() + "Valor:" + elemento.getValue());
	}
	Iterator<Integer>it =equi.keySet().iterator();
	while(it.hasNext()) {
		Integer key=it.next();
		System.out.println("Clave:" + key+ " ->Valor:"+ equi.get(key));
	}
	}

}
class Equipo{
	public String nombre;
	public String ciudad;
	public Equipo(String nombre,String ciudad) {
	this.nombre=nombre;
	this.ciudad=ciudad;
	}
	@Override
	public String toString() {
		return nombre + " "+ ciudad;
	}
}