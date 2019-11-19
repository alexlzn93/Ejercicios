package cice.master.java;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[] caras = new int[6]; 
		for (int i = 0; i < 6000; i++) {
			int cara = (int)(Math.random() * 6);
			caras[cara]++;
		}
		for (int i = 0; i < 6; i++) {
			double porcentaje = caras[i] / 6000.0 * 100.0;
			System.out.println("Cara " + i + " veces " + caras[i] + " porcentaje " + porcentaje);
		}
	}

}
