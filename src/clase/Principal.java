package clase;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) { 
		
		
		
		 /*int[] lista = {2,6,9,14,16,29,31};
	       int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que quiere buscar:"));
	       int min,med,sup,i;
	       boolean band = false;
	       min = 0;
	       sup = 12;
	       med = (min+sup)/2;
	       i = 0;
	       while (i<12 && band == false){
	           if (lista[med] == dato){
	               band = true;
	               break;
	           }
	           else if (lista[med]>dato){
	               sup = med;
	               med = (sup+min)/2;
	           }
	           else if (lista[med]<dato){
	               min = med;
	               med = (sup+min)/2;
	           }
	           i++;
	       }
	       if (band == true){
	           JOptionPane.showMessageDialog(null,"El Dato se encontro en la poscición: "+med);
	       }else {
	           JOptionPane.showMessageDialog(null,"El dato no se encuentra en la Lista.");
	       }*/
		
		/*int[] array = {1,2,3,4};
		int f = array.length;
		int c = array.length;
		
		int b[][] = new int[f][c];
		for (int i = 0; i < f; i++) {
			for (int k = 0; k < f; k++) {
				if (k == i) {
					b[i][k] = array[i];
				} else if (k == i + 1) {
					b[i][k] = 1;
				} else {
					b[i][k] = 0;
				}
			
			}
		}
		
		for(int i = 0; i<f;i++) {
			for(int j= 0;j<c;j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}*/
		double n = 1.5;
		
		int m = (int)(n);
		
		System.out.println(calculo1(44));
}
	public static double calculo(int n) {
		double prod = 1.0;
		double suma = 0.0;
		for (int i = 0; i < n; i++) {
            if(i>=1) {
			prod*=i;
            }
			
           
			if (i % 2 == 0 ) {
				suma += 1 / prod;
			} else {
				suma += -1 / prod;
			}

			
		}
		return suma;

	}
	
	public static double calculo1(int n) {
		double prod = 1.0;
		double suma = 0.0;
		for (int i = 0; i < n; i++) {
			prod = 1.0;
			for (int j = 1; j <= i; j++) {
				prod *= j;
				
			}
			if (i % 2 == 0) {
				suma += 1 / prod;
			} else {
				suma += -1 / prod;
			}
		}
		return suma;

	}
	
	
	
	
	public static void calculo3 (int n) {
		int m = 1;
		int i = 0;
		int suma = 0;
		while (m <= n) {
			m = m * 2;
			i++;
		}
		System.out.println("Son " + i + " iteraciones del primer while.");
		while (i <= n) {
			suma += i * i;
			i++;
		}
		

		System.out.println(i);
		
	}

public static int[][] matrizDiag(int[] a) {
	int n = a.length;
	int b[][] = new int[n][n];
	for (int i = 0; i < n; i++) {
		for (int k = 0; k < n; k++) {
			if (k == i) {
				b[i][k] = a[i];
			} else if (k == i + 1) {
				b[i][k] = 1;
			} else {
				b[i][k] = 0;
			}
		}
	}
	return b;
}
	


public static double sumar(double n) {
	double suma = 0;
	for(int i = 1 ; i<=n ;i++) {		
		if(i %2 == 0) {
			suma+=1 / n;
		}else {
			suma+=-1 / n;
		}
	}
	
	return suma;
}
	
public static boolean esPar(int n) {
	if(n%2 == 0) {
		return true;
	}
	return false;
			
		
}

public static void imprimeDivision(int n) {
	while (n > 1) {
		System.out.print(n % 2);
		n = n / 2;
	}
	System.out.print(n);
}

public static int sumaRara(int n) {
	if (n == 0) {
		return 1;
	}
	return (n / 2) + sumaRara(n - 1);
}

public static int impresionRepe(int n) {
	int cont = 0;
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < i; j++) {
			cont++;

		}
	}

	return cont;

}


	
}