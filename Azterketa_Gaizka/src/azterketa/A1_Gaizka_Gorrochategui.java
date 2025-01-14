package azterketa;

import java.util.Scanner;

public class A1_Gaizka_Gorrochategui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dirua, kopuru500 = 0, kopuru200 = 0, kopuru100 = 0, kopuru50 = 0, kopuru20 = 0, kopuru10 = 0, kopuru5 = 0, kopuru2 = 0, kopuru1 = 0;
		System.out.println("Sartu diru-kopuru bat eurotan:");
		dirua = sc.nextInt();
		
		//500 billeteak
		do{
			if (dirua - 500 >= 0) {
				kopuru500 = kopuru500+1;
				dirua = dirua-(500);
			}
		}while(dirua >= 500);
		//200 billeteak
		do{
			if (dirua - 200 >= 0) {
				kopuru200 = kopuru200+1;
				dirua = dirua-(200);
			}
		}while(dirua >= 200);
		//100 billeteak
		do{
			if (dirua - 100 >= 0) {
				kopuru100 = kopuru100+1;
				dirua = dirua-(100);
			}
		}while(dirua >= 100);
		//50 billeteak
		do{
			if (dirua - 50 >= 0) {
				kopuru50 = kopuru50+1;
				dirua = dirua-(50);
			}
		}while(dirua >= 50);
		//20 billeteak
		do{
			if (dirua - 20 >= 0) {
				kopuru20 = kopuru20+1;
				dirua = dirua-(20);
			}
			
		}while(dirua >= 20);
		//10 billeteak
		do{
			if (dirua - 10 >= 0) {
				kopuru10 = kopuru10+1;
				dirua = dirua-(10);
			}
		}while(dirua >= 10);
		//5 billeteak
		do{
			if (dirua - 5 >= 0) {
				kopuru5 = kopuru5+1;
				dirua = dirua-(5);
			}
		}while(dirua >= 5);
		//2 billeteak
		do{
			if (dirua - 2 >= 0) {
				kopuru2 = kopuru2+1;
				dirua = dirua-(2);
			}
		}while(dirua >= 2);
		//1 billeteak
		do{
			if (dirua - 1 >= 0) {
				kopuru1 = kopuru1+1;
				dirua = dirua-(1);
			}
		}while(dirua >= 1);
		
		System.out.println("500 euroko billeteak: " + kopuru500);
		System.out.println("200 euroko billeteak: " + kopuru200);
		System.out.println("100 euroko billeteak: " + kopuru100);
		System.out.println("50 euroko billeteak: " + kopuru50);
		System.out.println("20 euroko billeteak: " + kopuru20);
		System.out.println("10 euroko billeteak: " + kopuru10);
		System.out.println("5 euroko billeteak: " + kopuru5);
		System.out.println("2 euroko txanponak: " + kopuru2);
		System.out.println("Euro 1eko txanponak: " + kopuru1);
		
		sc.close();
	}

}
