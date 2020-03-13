package master.java;

public class Mates implements IOperacion {

	@Override
	public int cubo(int numero) {
		// TODO Auto-generated method stub
		return (int)Math.pow(numero, 3);
		
	}

	@Override
	public int division(int numero1, int numero2) {
		
		return numero1/numero2;
	}
	
}
