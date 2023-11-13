package clase;

public class Persona {
	
	private String nombre;
	private int edad;
	private int dni;
	
	public Persona(String nombre, int edad,int dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		
		if(nombre.length()<=2) {
			throw new RuntimeException("Nombre invalido.");
		}
		
		if (edad < 0 || edad>120) {
			throw new RuntimeException("Edad ingresada es invalida.");
		}
		
		if(dni >100000000) {
			throw new RuntimeException("dni invalido.");
		}
		
	}
	
	public void datos() {
	    System.out.print("nombre: "+nombre+" \nedad: "+edad);
	}
	
	public boolean masJoven(Persona p2) {
		return this.edad < p2.edad?true:false;
	}
	
	public boolean tocayo(Persona p2) {
		return this.nombre.equals(p2.nombre)?true:false; 
		
	}
	
	public boolean mismaPersona(Persona p2) {
		
	return this.dni == p2.dni;
	
	}
	
	public  static Persona masJoven(Persona[] grupo) {
		int indice = 0;
		int masjoven = grupo[0].edad;
		
		for(int i = 1;i<grupo.length;i++) {
			if(masjoven > grupo[i].edad) {
				masjoven = grupo[i].edad;
				indice = i;
			}
			
		}
		
		return grupo[indice];
	}
	
	public static Persona buscarNombre(Persona[] grupo,String name) {	
		Persona buscado = null;
		for(int i = 0;i<grupo.length;i++) {
			if(grupo[i].nombre.equals(name)) {
				buscado = grupo[i];
			}
	
		}
		
		return buscado;
		
		
	}

	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	
	
	
	

}
