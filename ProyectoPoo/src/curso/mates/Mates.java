package curso.mates;

//Las clases tienen modificacodres de visibilidad se aplican a clases variable de clase y metodos de clase
//public : es accesible por todas las clases independientemente del paquete donde esten
//protected: aplicable a clases ,variables y metodos de clase accesibles a aquellas clases que perteenezcan al mismo paquete que defina protected
//private: no hereda de ninguna clase, esta oculto
// default: solamente las del mismo paquete
public class Mates {
//sobrecarga de metodos
	protected int suma(int a, int b) {
		return a + b;
	}

	int suma(int a) {
		return a + 2;
	}

	float suma(float x, float y) {
		return (float) (x + y);
	}

	double suma(double a, double b) {
		return a + b;
	}

	Long suma(Long a, Long b) {
		return a + b;
	}

	byte suma(byte a, byte b) {
		return (byte) (a + b);
	}
}
