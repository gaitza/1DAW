package ariketak;

import java.util.Arrays;
import java.util.Random;

public class Ariketa3 {

	public static void main(String[] args) {
		
		        int[] numbers = new int[100];

		        Random random = new Random();

		        for (int i = 0; i < numbers.length; i++) {
		            numbers[i] = random.nextInt(1001); 
		        }

		        Arrays.sort(numbers);

		        System.out.println("Array ordenado de menor a mayor:");
		        for (int number : numbers) {
		            System.out.print(number + " ");
		        
		    }
		


	}

}

