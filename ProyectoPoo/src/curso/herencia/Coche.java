package curso.herencia;

public class Coche extends Terrestre {

	

	@Override
	public int getRuedas() {
		// TODO Auto-generated method stub
		return ruedas;  //ruedas de la clase terrestre que esta inicializada en 4
	}

	@Override
	public void setRuedas(int ruedas) {
		// TODO Auto-generated method stub
		this.ruedas=ruedas;
	}
}
