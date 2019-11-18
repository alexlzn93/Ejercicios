package cice.master.java.clases;

public enum Equipos {

	REAL_MADRID("Real Madrid",1940,500),SEVILLA("Club de futbol Sevilla", 1960),CELTA("Celta de Vigo");  //hay que crear constructores para llamar a los diferentes parametros
    //nombreEquipo,fundacion,socios      //nombreEquipo,fundacion               // nombreEquipo
	
	private String nombre;
	private int fundacion;
	private int socios;
	
	private Equipos(String nombreEquipo,int fundacion, int socios) { //Este constructor llama a la enum REAL_MADRID porque lleva tres parametros(equipo fundacion y socios)
		nombre=nombreEquipo;
		this.fundacion= fundacion;
	}
	private Equipos(String nombreEquipo,int fundacion) { //Este contrsuctor llama a SEVILLA (nombreEquipo y fundacion)
		nombre= nombreEquipo;
		this.fundacion=fundacion;
	}
	private Equipos(String nombreEquipo) {
		nombre= nombreEquipo;
	}

}
