import java.util.ArrayList;

public class Casa {
	private int m2;
	private Direccion direcion;
	private ArrayList<Habitacion> habitaciones;
	private Persona propietario;
	private ArrayList<Persona> inquilino;
	private int precio;
	
	public Casa() {
		super();
	}
	
	public Casa(Direccion direcion, ArrayList<Habitacion> habitaciones, Persona propietario,
			ArrayList<Persona> inquilino, int precio) {
		super();
		this.m2 = calcularM2(habitaciones);

		this.direcion = direcion;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
		this.inquilino = inquilino;
		this.precio = precio;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public Direccion getDirecion() {
		return direcion;
	}

	public void setDirecion(Direccion direcion) {
		this.direcion = direcion;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public ArrayList<Persona> getInquilino() {
		return inquilino;
	}

	public void setInquilino(ArrayList<Persona> inquilino) {
		this.inquilino = inquilino;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int calcularM2(ArrayList<Habitacion> habitacion) {
		int metros = 0;
		for (Habitacion m3 : habitacion) {
			metros += m3.getM2();
		}
		return metros;
	}

	@Override
	public String toString() {
		return "Casa m2=" + m2 + ", direcion=" + direcion + ", habitaciones=" + habitaciones + ", propietario="
				+ propietario + ", inquilino=" + inquilino + ", precio=" + precio;
	}


}
