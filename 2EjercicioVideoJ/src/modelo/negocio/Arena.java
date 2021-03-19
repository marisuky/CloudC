package modelo.negocio;
import java.util.Scanner;

import modelo.entidad.Personaje;
public class Arena {
	private Personaje p1;
	private Personaje p2;
	
	public Arena(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * 
	 * @return el personaje que haya ganado
	 */
	public Personaje combate() {
		Personaje pi = null;
		Personaje pf = null;
		
		if(p1.getIniciativa() >= p2.getIniciativa()) {
			pi = p1;
			pf = p2;
		}else {
			pi = p2;
			pf = p1;
		}
		
		System.out.println("Inicia combate: " + pi.getNombre());
		
		Scanner sc = new Scanner(System.in);
		
		do {
			pi.atacar(pf);
			
			if(pf.getPuntosVida() <= 0) {
				return pi;
			}
			
			pf.atacar(pi);
			
			if(pi.getPuntosVida() <= 0) {
				return pf;
			}
			
			System.out.println("Puntos de vida de " + pi.getNombre());
			System.out.println(pi.getPuntosVida());
			System.out.println("Puntos de vida de " + pf.getNombre());
			System.out.println(pf.getPuntosVida());
			System.out.println("Turno pasado, pulse enter");
			System.out.println();
			sc.nextLine();
		}while(true);
	}
}
