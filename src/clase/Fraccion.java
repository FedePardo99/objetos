package clase;

public class Fraccion {
	
	int numerador,denominador;
	
	public Fraccion(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void imprimirFraccion() {
		System.out.println(numerador+"/"+denominador);
	}
	
	public void invertir() {
		System.out.println(denominador+"/"+numerador);
	}
	
	public void invertirSigno() {
		if (((double)numerador/(double)denominador)> 0) {
		System.out.println((numerador*-1)+"/"+denominador);
		}else if (numerador < 0) {
		System.out.println((numerador*-1)+"/"+denominador);
		}else if (denominador < 0) {
			System.out.println(numerador+"/"+denominador*-1);
			}		
	}
	
	public double aDouble() {
		return (double) numerador/(double)denominador;
	}
	
	public void reducir() {
		int mcd = mcd(numerador,denominador);
		System.out.println(numerador/mcd+"/"+denominador/mcd);
		
	}
	
	public static void fraccionProducto(Fraccion f1, Fraccion f2) {
		int pn = f1.numerador*f2.numerador;
		int pd = f1.denominador * f2.denominador;
		int mcd = mcd(pn,pd);
		System.out.println(pn/mcd+"/"+pd/mcd);
		
	}
	
	public static void fraccionSuma(Fraccion f1, Fraccion f2) {
		int sumaNum = (f1.denominador *f2.numerador)+(f1.numerador*f2.denominador);
		int sumaDen = f1.denominador*f2.denominador;
		
		int mcd = mcd(sumaNum,sumaDen);
		System.out.println(sumaNum/mcd+"/"+sumaDen/mcd);
	}
	public static int mcd(int a, int b) {
	   	 
	   	 if(a%b == 0) {
	   		 return b ;
	   	 }
	   	 
	   	 return mcd(b,a%b);
	   	
	   	 
	    }
	
	

}
