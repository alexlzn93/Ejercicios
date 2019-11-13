package curso.herencia;

public  class Avion extends Aviacion implements IRuedas,IMostrar{

	
	public int rotores;

	@Override
	public void setRotores(int rotores) {
		// TODO Auto-generated method stub
		this.rotores=rotores;
	}

	@Override
	public int getRotores() {
		// TODO Auto-generated method stub
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

	@Override
	public void mostrarTipo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
