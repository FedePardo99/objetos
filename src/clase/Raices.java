package clase;

public class Raices {
	
	private double a;
	private double b;
	private double c;
	
	public Raices(double a, double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void obtenerRaices() {
		System.out.println("las raices son: "+(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a)+" y "+(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a));
	}
	public void obtenerRaiz() {
		System.out.println("La unica raiz es: "+(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a));
	}
	
	
	public double GetDiscriminante() {
		return ((b*b)-(4*a*c));
	}
	
	public boolean tieneRaices() {
		if(GetDiscriminante() > 0) {
			return true;
		}
		return false;
	}
	public boolean tieneRaiz() {
		return GetDiscriminante() == 0;
	}
	
	public void calcular() {
		if(tieneRaices()) {
			obtenerRaices();
			
		}else if(tieneRaiz()) {
			obtenerRaiz();		
		}
			
		System.out.println("No tiene raices.");		
	}
	
	
	

}
