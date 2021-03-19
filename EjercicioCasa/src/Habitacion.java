
public class Habitacion {
	private int m2;
	private String tipo;
	private int num;
	@Override
	public String toString() {
		return "Habitacion m2=" + m2 + ", tipo=" + tipo + ", num=" + num;
	}
	
	public Habitacion() {
		super();
	}
	
	public Habitacion(int m2, String tipo, int num) {
		super();
		this.m2 = m2;
		this.tipo = tipo;
		this.num = num;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
