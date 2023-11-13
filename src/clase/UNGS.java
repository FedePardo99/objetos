package clase;

import java.util.ArrayList;

public class UNGS {
	
	private Comision comisiones[];

	public UNGS(int n) {
		this.comisiones = new Comision[n];			
	}
	
	
	public boolean cursaCon(Docente d, Estudiante e) {
		for (Comision c: comisiones) {
			if(c.estaInscripto(d, e)) {
				return true;
			}
		}
		
		return false;
	}
	
	public Estudiante MasEstudioso() {
		Estudiante[] nerds = null;
		
		int[] notas = null ;// aca es mejor usar una arraylist
		
		
		for(int i = 0;i<comisiones.length;i++) {
			nerds[i] = comisiones[i].mejorDeLaClase();
			notas[i] = comisiones[i].mejorNota();
		}
		
		
		int pos = 0;
		int mejorNota = notas[0];
		
		for(int i = 1;i<notas.length;i++) {
			if(mejorNota < notas[i]) {
				mejorNota = notas[i];
				pos = i;
			}
		}
		
		return nerds[pos];
	}
	
	public int alumnosDe(Docente d) {
		int cont = 0;
		for(Comision c: comisiones) {
			if(c.alumonsDelDocente(d)) {
				cont += c.contarAlumnos();
			}
		}
		
		return cont;
		
	}
	
}
