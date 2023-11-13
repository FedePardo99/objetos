package clase;

import java.util.ArrayList;
import java.util.Scanner;

public class Comision {
	
	

	private String materia;
	private int numero;
	private ArrayList <Docente> docentes = new ArrayList<>();
	private  Estudiante[] inscriptos;
	private int [] calificaciones = new int[6];

	public Comision(String materia,int numero) {
      this.materia = materia;
      this.numero = numero;    
	}
	
	public boolean estaInscripto(Docente p, Estudiante e) {
		boolean estaAlumno = false;
		boolean estaDocente = false;
		
		for(Docente d: docentes) {
			if(d.getNombre().equals(p.getNombre())){
				estaDocente = true;
			}
		}
		for(Estudiante a: inscriptos) {
			if(a.getNombre().equals(e.getNombre())){
				estaAlumno = true;
			}
		}
		
		if(estaAlumno == true && estaDocente == true) {
			return true;
		}
		
		return false;	
	}
	
	public Estudiante mejorDeLaClase() {
		
		int notaAlta = calificaciones[0];
		int pos = 0;
		
		for(int i = 1;i<calificaciones.length;i++) {
			if(notaAlta < calificaciones[i]) {
				pos = i;
			}
		}
		
		return inscriptos[pos];
		
	}
	public int mejorNota() {
		int notaAlta = calificaciones[0];
		int pos = 0;
		
		for(int i = 1;i<calificaciones.length;i++) {
			if(notaAlta < calificaciones[i]) {
				pos = i;
			}
		}
		
		return calificaciones[pos];
		
	}
	
	public boolean alumonsDelDocente(Docente d) {
		for(Docente p : docentes) {
			if(p.getNombre().equals(d.getNombre())){
				return true;
			}
		}
		return false;
	}
	
	public int contarAlumnos() {
		return inscriptos.length;
	}
	
	
	
	
	
	
}
