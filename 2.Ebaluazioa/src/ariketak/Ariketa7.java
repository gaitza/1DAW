package ariketak;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ariketa7 {
	/*
	public static int[] bikoitizBete(int luzera, int bikoitiMax) {
        Random rand = new Random();  
        int[] array = new int[luzera]; 
        
        for (int i = 0; i < luzera; i++) {
        	
            array[i] = 2 * rand.nextInt(bikoitiMax + 1);
        }
        
        return array; // Array-a itzuli
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	         System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();
        System.out.print("Introduce el valor máximo para los números pares: ");
        int maximo = scanner.nextInt();

	        
	        int[] array = bikoitizBete(luzera, bikoitiMax);
	        
	        
	        System.out.println("Sortutako bikoiti array: ");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }
	*/
	public static int[] bikoitizBete(int luzera, int bikoitiMax) {
        if (luzera <= 0 || bikoitiMax <= 0) {
            throw new IllegalArgumentException("La longitud y el máximo valor deben ser positivos.");
        }

        Random rand = new Random();
        return IntStream.generate(() -> 2 * rand.nextInt(bikoitiMax / 2 + 1))
                       .limit(luzera)
                       .toArray();
    }

    public static void main(String[] args) {
        // Obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();
        System.out.print("Introduce el valor máximo para los números pares: ");
        int maximo = scanner.nextInt();

        // Generar y mostrar el array
        int[] array = bikoitizBete(longitud, maximo);
        System.out.println("Array generado: " + Arrays.toString(array));
    }
	}



