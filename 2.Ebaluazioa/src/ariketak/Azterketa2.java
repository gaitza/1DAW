package ariketak;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Azterketa2 extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Dibujo de Diamante");
		Azterketa2 panel = new Azterketa2();
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		dibujarDiamante(g, 5); // Ajusta el número máximo de 'X' por fila
	}

	public void dibujarDiamante(Graphics g, int maxXs) {
		int anchoCelda = 20;
		int altoCelda = 20;
		int margen = 20;

		for (int i = 0; i < maxXs; i++) {
			// Calcula el número de espacios en blanco a la izquierda
			int espacios = (maxXs - i) / 2;

			// Dibuja los espacios en blanco
			for (int j = 0; j < espacios; j++) {
				g.drawString(" ", margen + j * anchoCelda, margen + i * altoCelda);
			}

			// Dibuja las 'X'
			for (int j = 0; j < i * 2 + 1; j++) {
				g.drawString("X", margen + (espacios + j) * anchoCelda, margen + i * altoCelda);
			}
		}

		// Dibuja la parte inferior del diamante (simétrica a la superior)
		for (int i = maxXs - 2; i >= 0; i--) {
			// Calcula el número de espacios en blanco a la izquierda
			int espacios = (maxXs - i) / 2;

			// Dibuja los espacios en blanco
			for (int j = 0; j < espacios; j++) {
				g.drawString(" ", margen + j * anchoCelda, margen + (maxXs + i) * altoCelda);
			}

			// Dibuja las 'X'
			for (int j = 0; j < i * 2 + 1; j++) {
				g.drawString("X", margen + (espacios + j) * anchoCelda, margen + (maxXs + i) * altoCelda);
			}
		}
	}

}
