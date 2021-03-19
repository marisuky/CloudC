package modelo.entidad;

public class Healer extends Personaje{
private int sabiduria;
	
	@Override
	public void atacar(Personaje p) {
		int dañoTotal = 0;
		if(this.getArma() instanceof Rezo) {
			dañoTotal = getArma().usar() + sabiduria;
			int curacion = (int)Math.round(dañoTotal * 0.1);
			this.setPuntosVida(this.getPuntosVida() + curacion);
			System.out.println("Healer se cura " + curacion);
		}else {
			dañoTotal = getArma().usar();
		}
		
		dañoTotal += getNivel() * 2;
		System.out.println("Healer hace " + dañoTotal);
		p.setPuntosVida(p.getPuntosVida() - dañoTotal);	
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

}
