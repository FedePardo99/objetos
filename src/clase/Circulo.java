package clase;

public class Circulo {
	double centro_x;
	double centro_y;
	double radio;
	
	public Circulo(double centro_x, double centro_y,double radio) {
		this.centro_y = centro_y;
		this.centro_x = centro_x;
		this.radio = radio;
	}
	
	public void imprimir() {
		System.out.println("centro_y = "+centro_y+"\ncentro_x: "+centro_x+"\nRadio: "+radio);
	}
	
	public double perimetro() {
		double diametro = radio *2;
		return 3.14*diametro;
	}
	
	public double superficie() {
		return 3.14*Math.pow(radio,2 );
	}
	
	public void escalar(double factor) {
		if(factor > radio) {
			System.out.println(factor/radio);
			return;
		}
		System.out.println(radio/factor);
		
	}
	public void desplazar(double desp_x,double desp_y) {
		System.out.println("nuevo centro x: "+centro_x+desp_x+
				          "\nnuevo centro y: "+centro_y+desp_y);
	}
	
	public static double distancia(Circulo c1 , Circulo c2) {
		double distanciaCentro;
		if((c1.centro_x-c2.centro_x)<0) {
			 distanciaCentro = (c1.centro_x-c2.centro_x)*-1;
		}
		else {
			distanciaCentro = c1.centro_x-c2.centro_y;
		}
		
		return distanciaCentro - (c1.radio+c2.radio);
		
	}
	
	public static boolean seTocan(Circulo c1, Circulo c2) {
		double distanciaCentro;
		if((c1.centro_x-c2.centro_x)<0) {
			 distanciaCentro = (c1.centro_x-c2.centro_x)*-1;
		}
		else {
			distanciaCentro = c1.centro_x-c2.centro_x;
		}
		if (distanciaCentro - (c1.radio+c2.radio)>0) {
			return false;
		}
		return true;
	}
	
	public boolean loContiene(Circulo c2) {
		if (this.centro_x == c2.centro_x && this.centro_y == c2.centro_y && this.radio == c2.radio) {
			return true;
		}
		if (((this.centro_x-c2.centro_x)-(this.radio+c2.radio))>0) {
			
			return false;
		}
		
		if(((this.centro_x-c2.centro_x)*-1-(this.radio+c2.radio))>0) {
			return false;
		}
		
		return true;
	}
	
	
	

}
