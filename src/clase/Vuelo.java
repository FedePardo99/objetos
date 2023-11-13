package clase;

public class Vuelo {
	private Avion avion;
	private Tripulante[] tripulacion;
	
	public Vuelo(Avion avion) {
		
		this.avion = avion;
	   
	}

	public Avion getAvion() {
		return avion;
	}

	public Tripulante[] getTripulacion() {
		return tripulacion;
	}
	
	public boolean buscarTripulante(Tripulante t) {
		for(Tripulante tr: tripulacion) {
			if(tr.getNombre().equals(t.getNombre())) {
				return true;
			}
		}
		
		return false;
	}
	
	public double promedioTripulantes() {
		double cont = 0;
		double suma = 0;
		
		for(Tripulante t: tripulacion) {
			suma+=t.getAntiguedad();
			cont++;
		}
		
		return suma/cont;
	}
	
	public int cantInspectores() {
		int cont = 0;
		for(Tripulante t : tripulacion) {
			if (t.getCargo().equals("inspector")) {
				cont++;
			}
		}
		return cont;
	}
	
	public boolean limiteDeAeromozos() {
		int limite = (int) (avion.getCapacidad() * 0.1);
		int cont = 0;
		for (Tripulante t : tripulacion) {
          if(t.getCargo().equals("Aeromozo")) {
        	  cont++;
          }
		}
		if(cont > limite) {
			return true;
		}

		return false;
	}
	
	public Tripulante darPiloto() {
		Tripulante piloto = null;
		for(Tripulante t: tripulacion) {
			if(t.getCargo().equals("piloto")) {
				 piloto = t;
			}
		}
		return piloto;
	}

	
	
	
	
	
}
