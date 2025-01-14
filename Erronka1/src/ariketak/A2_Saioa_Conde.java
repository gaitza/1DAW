package ariketak;

public class A2_Saioa_Conde {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("O");
		}
		
		for (int i = 2; i >= 0; i--) {	
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			
			System.out.println("O");
		}
	}
}
