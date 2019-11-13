package curso.clases;

public class Estatica {

	public static double altura;
	public static int peso;
	static {
		altura=200.17;
		peso=78;
		
	}
	static {
		System.out.println("proceso de inicializacion");
		
		System.out.println("altura" + altura);
	}
	
	public static void main(String[]a) {
		Hombre hombre= new Hombre();  //crear un objeto de la clase Hombre(instanciar una clase)
		hombre.edad=25;
		hombre.nombre="Lucas";
		hombre.numero=18; //aqui le doy yo el valor a numero
		System.out.println(hombre.numero); //18
		
		Hombre pepito= new Hombre();  //Instancia de la clase Hombre
		pepito.nombre="Pepito";
		pepito.edad=21;
		pepito.numero=38;  //me da 38 porq en la clase Hombre e declarado una variable static numero; y estoy dentro del objeto Hombre 
		
		System.out.println(pepito.numero); //38
		System.out.println(hombre.numero); //38
		
		Hombre josefa= new Hombre();
		josefa.nombre="Josefa";
		josefa.edad=19;
		
		pepito.edad=28;
	
		
		int rdo= Hombre.suma(5, 8);
	}
	static {
		System.out.println("proceso de inicializacion");
		System.out.println(peso + "kilos");
	}
}
