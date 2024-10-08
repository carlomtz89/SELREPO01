package javaBasic;

public class Ejemplo_IfAnidado {

	public static void main(String[] args) {
		int temperatura = 26;
		
		if (temperatura > 15  ) {
			if (temperatura > 25) {
				System.out.println("a la playa");
			}else {
				System.out.println("a la montania");
			}
		}else {
			System.out.println("a descansar");
		}

	}

}
