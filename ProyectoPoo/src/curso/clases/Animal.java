package curso.clases;

public abstract class Animal {

	public int patas;
	
	public abstract int getPatas();
	
	public void mostrarPatas() {
		System.out.println(patas);
	}
}
