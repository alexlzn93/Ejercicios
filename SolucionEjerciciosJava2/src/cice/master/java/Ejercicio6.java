package cice.master.java;

public class Ejercicio6 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String digitoI = (i == 3) ? "E" : "" + i;
			for (int k = 0; k < 10; k++) {
				String digitoK = (k == 3) ? "E" : "" + k;
				for (int m = 0; m < 10; m++) {
					String digitoM = (m == 3) ? "E" : "" + m;
					for (int n = 0; n < 10; n++) {
						String digitoN = (n == 3) ? "E" : "" + n;
						for (int p = 0; p < 10; p++) {
							String digitoP = (p == 3) ? "E" : "" + p;
							String contador = digitoI + "-" + digitoK + "-" + digitoM + "-" + digitoN + "-" + digitoP;
							System.out.println(contador);
						}
					}
				}
			}
		}
	}

}
