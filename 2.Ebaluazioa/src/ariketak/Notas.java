package ariketak;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Datos de ejemplo: nombres de alumnos y notas
		String[] nombres = { "Juan", "Ana", "Luis", "Marta" };
		int[][] notas = { { 85, 90, 78 }, // Notas de Juan
				{ 92, 88, 84 }, // Notas de Ana
				{ 75, 80, 72 }, // Notas de Luis
				{ 88, 92, 95 } // Notas de Marta
		};

		boolean salir = false;

		while (!salir) {
			System.out.println("\n--- MENÚ ---");
			System.out.println("1. Mostrar notas de un alumno");
			System.out.println("2. Mostrar media de notas de una asignatura");
			System.out.println("3. Mostrar suma total de todas las notas");
			System.out.println("4. Salir");
			System.out.print("Elige una opción: ");
			int opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				mostrarNotasAlumno(nombres, notas, sc);
				break;
			case 2:
				calcularMediaAsignatura(notas, sc);
				break;
			case 3:
				calcularSumaTotal(notas);
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}
		}
		sc.close();
	}

	// Método para mostrar las notas de un alumno
	private static void mostrarNotasAlumno(String[] nombres, int[][] notas, Scanner sc) {
		System.out.print("Introduce el nombre del alumno: ");
		String nombreBuscado = sc.next();
		boolean encontrado = false;

		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
				encontrado = true;
				System.out.println("Notas de " + nombres[i] + ":");
				for (int j = 0; j < notas[i].length; j++) {
					System.out.println("Asignatura " + (j + 1) + ": " + notas[i][j]);
				}
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Alumno no encontrado.");
		}
	}

	// Método para calcular la media de las notas de una asignatura
	private static void calcularMediaAsignatura(int[][] notas, Scanner sc) {
		System.out.print("Introduce el número de la asignatura (1, 2 o 3): ");
		int asignatura = sc.nextInt();

		if (asignatura < 1 || asignatura > notas[0].length) {
			System.out.println("Número de asignatura no válido.");
			return;
		}

		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i][asignatura - 1];
		}
		double media = suma / notas.length;
		System.out.println("La media de la asignatura " + asignatura + " es: " + media);
	}

	// Método para calcular la suma total de todas las notas
	private static void calcularSumaTotal(int[][] notas) {
		int sumaTotal = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				sumaTotal += notas[i][j];
			}
		}
		System.out.println("La suma total de todas las notas es: " + sumaTotal);
	}

}
