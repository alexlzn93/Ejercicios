package cice.master.java.clases;

public enum Color {

	ROJO(1),AZUL(4),AMARILLO(8),VERDE(0);
	
	private int numeroColor;
	private Color(int color) {
		numeroColor=color;
	}
	
	public int getColor() {   //GETTER
		return numeroColor;
	}
}
