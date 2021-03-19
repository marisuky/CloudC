package modelo.entidad;

public class Guerrero extends Personaje{
	
private int fuerza;
	
	@Override
	public void atacar(Personaje p) {
		int dañoTotal = 0;
		if(this.getArma() instanceof Espada || 
				this.getArma() instanceof Arco) {
			dañoTotal = getArma().usar() + fuerza;
		}else {
			dañoTotal = getArma().usar();
		}
		
		dañoTotal += getNivel() * 2;
		System.out.println("Guerrero hace " + dañoTotal);
		p.setPuntosVida(p.getPuntosVida() - dañoTotal);	
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
}
