package clase;

public class Aerolinea {
	
	Vuelo[] vuelos;
	
	public Aerolinea() {
		
		vuelos = new Vuelo[10];
				
	}
	
	
	//poner codigos principales aca
	
	public int vuelosEn(Tripulante t, String tipoAvion) {
		
	int cont = 0;
	
	for(Vuelo v: vuelos) {		
		if(v.buscarTripulante(t)) {
			if(v.getAvion().getTipo().equals(tipoAvion)) {
				cont++;
			}
		}
		}
	return cont;
	}

	public double antiguedadPromedio(String tipoAvion) {
		double suma = 0;
		double cont = 0;
		for(Vuelo v: vuelos) {	
			if(v.getAvion().getTipo().equals(tipoAvion)) {
				suma+=v.promedioTripulantes();
				cont++;
			}
			
		}
		return suma/cont;
	}
	
	public Vuelo elMasInspeccionado() {
		Vuelo masInspeccionado = vuelos[0];
		
		for(Vuelo v: vuelos) {
			if(masInspeccionado.cantInspectores() < v.cantInspectores()) {
				masInspeccionado = v;
			}
		}
		
		return masInspeccionado;
	}
	
	public boolean hayVueloSobrecargado() {
		for(Vuelo v: vuelos) {
			if(v.limiteDeAeromozos()) {
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
