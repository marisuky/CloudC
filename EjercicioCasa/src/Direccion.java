
public class Direccion {
	private String tipovia;
	private String nom_via;
	private String cp;
	private int num;
	
	public Direccion() {
		super();
	}
	
	public Direccion(String tipovia, String nom_via, String cp, int num) {
		super();
		this.tipovia = tipovia;
		this.nom_via = nom_via;
		this.cp = cp;
		this.num = num;
	}
	public String getTipovia() {
		return tipovia;
	}
	public void setTipovia(String tipovia) {
		this.tipovia = tipovia;
	}
	public String getNom_via() {
		return nom_via;
	}
	public void setNom_via(String nom_via) {
		this.nom_via = nom_via;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Direccion tipovia=" + tipovia + ", nom_via=" + nom_via + ", cp=" + cp + ", num=" + num;
	}
	
	
}
