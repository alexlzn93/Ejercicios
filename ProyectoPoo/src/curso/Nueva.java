package curso;

import curso.mates.Mates;

public class Nueva extends Mates{
	
	int doble(int b) {
		return b*2;
	}
	@Override //Sobreescritura
	public int suma(int t, int r) {
		return(t+r)*2;
		
	}
	void mostrar() {
		int r=suma(8,8);
		System.out.println(r);
	}
	
}
