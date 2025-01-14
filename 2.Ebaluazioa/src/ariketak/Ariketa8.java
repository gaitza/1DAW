package ariketak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ariketa8 {

    // Metodoa: Teklatutik 10 zenbaki jasotzen ditu array batean gordetzeko
    public static int[] getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Sartu 10 zenbaki oso:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". zenbakia: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    // Metodoa: Array-a txikienetik handienera ordenatzeko (burbuila-algoritmoa erabiliz)
    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Trukatu elementuak
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Metodoa: Bi array (desordenatua eta ordenatua) fitxategian gordetzeko
    public static void writeToFile(int[] originalArray, int[] sortedArray, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.printf("Desordenatutako array-a:\n");
            for (int num : originalArray) {
                writer.printf("%d ", num);
            }
            writer.printf("\n\n");

            writer.printf("Ordenatutako array-a:\n");
            for (int num : sortedArray) {
                writer.printf("%d ", num);
            }
            writer.printf("\n");

            System.out.println("Array-ak " + fileName + " fitxategian gorde dira.");
        } catch (IOException e) {
            System.err.println("Errorea fitxategian idazterakoan: " + e.getMessage());
        }
    }

    // Metodoa: Fitxategiko edukia irakurri eta pantailan bistaratzeko
    public static void displayFileContent(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Errorea fitxategia irakurtzerakoan: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // 1. Erabiltzailearen sarrera lortu
        int[] originalArray = getNumbersFromUser();

        // 2. Array-aren kopia sortu eta ordenatu
        int[] sortedArray = originalArray.clone();
        sortArray(sortedArray);

        // 3. Array-ak fitxategian gorde
        String fileName = "BiArray.txt";
        writeToFile(originalArray, sortedArray, fileName);

        // 4. Fitxategiko edukia pantailan bistaratu
        System.out.println("Fitxategiko edukia:");
        displayFileContent(fileName);
    }
}
