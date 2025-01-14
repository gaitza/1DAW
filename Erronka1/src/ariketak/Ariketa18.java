package ariketak;

public class Ariketa18 {

	public static void main(String[] args) {

		System.out.println("Patrón 1:");
		patron1();

		System.out.println("\nPatrón 2:");
		patron2();

		System.out.println("\nPatrón 3:");
		patron3();
	}

	// Función para el patrón 1
	public static void patron1() {
		for (int i = 0; i < 7; i++) {
			System.out.print("* ");
		}
		for (int j = 0; j < 5; j++) {
			System.out.println();
			for (char letra : "* K A I X O *".toCharArray()) {
				System.out.print(letra);
			}
		}
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print("* ");
		}
	}

	// Función para el patrón 2
	public static void patron2() {
		for (int i = 0; i < 7; i++) {
			System.out.print("* ");
		}
		
		
		
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print("* ");
		}
	}

	// Función para el patrón 3
	public static void patron3() {
		
	}

}
