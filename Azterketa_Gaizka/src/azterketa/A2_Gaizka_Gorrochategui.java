package azterketa;

public class A2_Gaizka_Gorrochategui {

	public static void main(String[] args) {
		int rows = 3;

		for (int i = 1; i <= rows; i++) {
			// Print spaces before the 'X's
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}

			// Print 'X's
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("X ");
			}

			System.out.println(); // Move to the next line
		}

		// Print the lower half of the diamond (mirror of the upper half)
		for (int i = rows - 1; i >= 1; i--) {
			// Print spaces before the 'X's
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}

			// Print 'X's
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("X ");
			}

			System.out.println(); // Move to the next line
		}

	}

}
