package javaBasic;

public class Ejemplo_Metodo {

	public static void main(String[] args) {
		int resultado = suma(30,40);
		int resultado2 = suma(10,20);

		System.out.println(resultado);
		System.out.println(resultado2);

	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}

}
