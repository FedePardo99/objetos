package clase;

public class Tripulante {
	private String nombre;
	private String cargo; //‘‘Piloto’’,‘‘Aeromozo’’, etc.
	private int antiguedad;
	
	public Tripulante(String nombre, String cargo, int antiguedad) {
		
		this.nombre = nombre;
		this.cargo = cargo;
		this.antiguedad = antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	
	
	
	

}
