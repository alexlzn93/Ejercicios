package curso.herencia;

public class Helicoptero extends Aviacion implements IRuedas {

	public int rotores;

	@Override
	public void setRotores(int rotores) {
		this.rotores=rotores;
		
	}

	@Override
	public int getRotores() {
		return rotores;
		
	}

	@Override
	public int getRuedas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRuedas(int ruedas) {
		// TODO Auto-generated method stub
		
	}
	
	
}
