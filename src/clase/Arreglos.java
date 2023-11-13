package clase;

public class Arreglos {
	
	public static boolean esSinRepetidos(int[] array) {
		for(int i = 0; i<array.length-1;i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[i] == array[j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static int[] pegar(int[] arr1,int[] arr2) {
		int[] nuevoArray = new int[arr1.length+arr2.length];
		
		for(int i = 0;i<arr1.length;i++) {
			nuevoArray[i] = arr1[i];
		}
		for(int i = 0;i<arr2.length;i++) {
			nuevoArray[arr1.length+i] = arr2[i];
		}
		
		
		return nuevoArray;
	}
	
	public static int[] agregarElemento(int[] arr, int elem) {
		int[] arr2 = new int[arr.length+1];
		for(int i = 0;i<arr2.length-1;i++) {
			arr2[i] = arr[i];
		}
		
		arr2[arr2.length-1] = elem;
		return arr2;
	}
	
	public static int[] sinRepetir(int[] arr) {
		int[] arr2 = new int[arr.length];
		boolean repetido;
		int j, top = 0;
		
		for (int i = 0;i<arr.length;i++) {
			repetido = false;
			j = 0;
			while(!repetido && j<top) {
				if(arr[i] == arr[j]) {
					repetido = true;
				}
				j++;
			}
			
			if(!repetido) {
				arr2[top] = arr[i];
				top++;
			}
			
		}
		
		for (int i = 0; i<top;i++) {
			arr2[i] = arr2[i];
		}
		
		return arr2;
		
		
		
	}
	
	public static int[] invertir(int[] array) {
		int[] arr = new int[array.length];
		int j = 0;
		for (int i = array.length-1;i>-1;i--) {
			arr[j] = array[i];
			j++;
		}
		return arr;
	}
	
	
	
	

}
