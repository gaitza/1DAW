package ariketak;

import java.util.Scanner;
import java.util.Random;


public class HundirLaFlota {

    public static void main(String[] args) {
        // Crear el tablero de juego 10x10
        char[][] tablero = new char[10][10];
        inicializarTablero(tablero);

        // Colocar barcos en el tablero
        colocarBarcos(tablero);

        // Juego principal
        Scanner scanner = new Scanner(System.in);
        int disparosRestantes = 20;
        int barcosHundidos = 0;

        System.out.println("¡Bienvenido a Hundir la Flota!");
        while (disparosRestantes > 0 && barcosHundidos < 5) {
            mostrarTablero(tablero, true);
            System.out.println("Te quedan " + disparosRestantes + " disparos.");
            System.out.print("Introduce la fila (0-9): ");
            int fila = scanner.nextInt();
            System.out.print("Introduce la columna (0-9): ");
            int columna = scanner.nextInt();

            if (fila < 0 || fila >= 10 || columna < 0 || columna >= 10) {
                System.out.println("Coordenadas fuera de rango. Intenta de nuevo.");
                continue;
            }

            if (tablero[fila][columna] == 'B') {
                System.out.println("¡Tocado y hundido!");
                tablero[fila][columna] = 'X';
                barcosHundidos++;
            } else if (tablero[fila][columna] == '-') {
                System.out.println("¡Agua!");
                tablero[fila][columna] = 'O';
            } else {
                System.out.println("Ya disparaste aquí. Intenta en otra coordenada.");
            }

            disparosRestantes--;
        }

        if (barcosHundidos == 5) {
            System.out.println("¡Felicidades! Has hundido todos los barcos.");
        } else {
            System.out.println("Se te acabaron los disparos. Fin del juego.");
        }
        mostrarTablero(tablero, false);
    }

    // Inicializar el tablero con guiones
    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    // Mostrar el tablero
    public static void mostrarTablero(char[][] tablero, boolean ocultarBarcos) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tablero[i].length; j++) {
                if (ocultarBarcos && tablero[i][j] == 'B') {
                    System.out.print("- ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Colocar 5 barcos aleatoriamente en el tablero
    public static void colocarBarcos(char[][] tablero) {
        Random random = new Random();
        int barcosColocados = 0;

        while (barcosColocados < 5) {
            int fila = random.nextInt(10);
            int columna = random.nextInt(10);

            if (tablero[fila][columna] == '-') {
                tablero[fila][columna] = 'B';
                barcosColocados++;
            }
        }
    }
}
