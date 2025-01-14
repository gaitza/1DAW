package ariketak;



import java.util.Scanner;



public class Azterketa1 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		Scanner sc = new Scanner(System.in);



		System.out.println("Sartu diru-kopuru bat eurotan:");

		int dirua = sc.nextInt();



		int[] array = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		int i;

		for (i = 0; i < 9; i++) {

			System.out.println(array[i] +  "euroko billeteak: " + dirua / array[i]);

			dirua %= array[i]; 

	

		}



	}

}
