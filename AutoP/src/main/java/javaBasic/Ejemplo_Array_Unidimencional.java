package javaBasic;

public class Ejemplo_Array_Unidimencional {

	public static void main(String[] args) {
		//ejemplos de arrays
		int intArray[];
		int[] intArray2;
		double doubleArray[];
		
		//declarar un array de string
		String[] arreglo;
		
		//asignar memoria de 5 strings
		arreglo = new String[5];
		
		//inicializar el primer elemento del array
		arreglo[0] = "cero";
		
		//inicializar el segundo elemento del array
		arreglo[1] = "uno";
		arreglo[2] = "dos";
		arreglo[3] = "tres";
		
		System.out.println("La posicion del arreglo es: " + arreglo[2]);
		System.out.println();
		
		for(int i = 0; i < arreglo.length; i++) { //arr.length calcula la longitud del arreglo en un tipo de dato entero
			System.out.println("Elemento en el indice " + i + ": " + arreglo[i]);
			
		}
		
		//ejemplo arreglo con enteros
		int[] intArreglo = new int[] {1,2,3,4,5,6,7,8};

	}

}
