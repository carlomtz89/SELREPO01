package javaBasic;

public class Ejemplo_Array_Bidimencional {

	public static void main(String[] args) {
		int arreglo[][] = {{2,7,9},{3,6,1},{7,6,1}};
		
		//System.out.println(arreglo[2][1]); //el 2 es el numero de posicion del arreglo y el 1 la posicion del valor
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arreglo[i][j] + " "); //print para imprimir en la misma linea
			}
			System.out.println();
		}

	}

}
