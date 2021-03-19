package modelo.entidad;

import java.util.concurrent.ThreadLocalRandom;

public class Util {
	public static int generadorNumeros(int rangoA, int rangoB) {
		int numero = ThreadLocalRandom.current().nextInt(rangoA,rangoB);
		return numero;
	}
}
