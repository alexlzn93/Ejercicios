package cice.master.java.clases;

public enum DiaSemana {
 LUNES("Lunes"),MARTES("Martes"),MIERCOLES("Miercoles");
	private String dia;
	private DiaSemana(String dia) {
		this.dia= dia;
	}
	public String getDia() {  //este metodo devuelve el dia 
		return dia;
	}
}
