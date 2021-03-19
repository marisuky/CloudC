package modelo.entidad;



public class Arma {
	
	private int dañoMinimo;
	private int dañoMaximo;
	private String tipo;
	
	public int usar() {
		int dañoCausado = Util.generadorNumeros(dañoMinimo, dañoMaximo);
		return dañoCausado;
	}
	
	public int getDañoMinimo() {
		return dañoMinimo;
	}
	public void setDañoMinimo(int dañoMinimo) {
		this.dañoMinimo = dañoMinimo;
	}
	public int getDañoMaximo() {
		return dañoMaximo;
	}
	public void setDañoMaximo(int dañoMaximo) {
		this.dañoMaximo = dañoMaximo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
