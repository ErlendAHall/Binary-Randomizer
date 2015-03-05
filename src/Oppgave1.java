import java.io.IOException;
import java.util.Random;

import javax.swing.*;

public class Oppgave1 {

	public static void main(String[] args) throws IOException {
		Random r = new Random();
		int tmp = -1;
		byte loop = 0; 
		boolean direction = false;
		int iteration = -1;
		
		int booleansIndex = getIndex();
		int[] booleans = new int[booleansIndex];
		fillArray(booleans);
		initialPrint(booleans);
		
	
		// Enkel og arbitrær evig løkke
		while (loop == 0) {
			booleansIndex = r.nextInt(booleans.length - 1); 	// en referanse til en index-verdi i booleans[]
			direction = r.nextBoolean(); 						// bestemmer om verdiene skal flytte seg til venstre eller høyre
			iteration = r.nextInt(101); 						// bestemmer statistisk hvor ofte programmet skal iterere. 							
			

			if (iteration == 1) { // om iteration != 1, vil programmer gjøre ingen verdens ting før den looper igjen.
				if (booleansIndex == 0	|| (booleansIndex == booleans.length - 1)) {
					indexBoundary(booleans, tmp, booleansIndex);

				}
				// Her skal disse to nested if-statements i teorien aldri kjøres samtidig
				if (booleansIndex != 0 && booleansIndex != booleans.length - 1) {
					indexNormal(booleans, tmp, booleansIndex, direction);
				}

				print(booleans, iteration);
			}
			
		}
		

	}

	private static int getIndex() {
		int t = 0;

		t = Integer
				.parseInt(JOptionPane
						.showInputDialog("Skriv inn et heltall for å angi arrayens lengde: "));

		return t;

	}

	private static void fillArray(int[] booleans) {

		for (double i = (booleans.length * 1 / 3); i < (booleans.length * 2 / 3); i++) {
			booleans[(int) i] = 1;
		}

	}

	private static void initialPrint(int[] booleans) throws IOException {

		for (double i = 0; i < booleans.length; i++) {
			if (booleans[(int) i] == 1) {
			}
			System.out.print((booleans[(int) i]));

		}

		System.out.println();
		System.out.println("Slik er array fylt. Trykk en tast for å fortsette");
		System.in.read();

	}

	private static void indexBoundary(int[] booleans, int tmp, int t) {
		if (t == 0) {
			tmp = booleans[0];
			booleans[0] = booleans[booleans.length - 1];
			booleans[booleans.length - 1] = tmp;

		} else if (t == booleans.length - 1) {
			tmp = booleans[0];
			booleans[0] = booleans[booleans.length - 1];
			booleans[booleans.length - 1] = tmp;
		}

	}

	private static void indexNormal(int[] booleans, int tmp, int t, boolean v) {

		if (v == true) {
			tmp = booleans[t + 1];
			booleans[t + 1] = booleans[t];
			booleans[t] = tmp;

		} else if (v == false) {
			tmp = booleans[t - 1];
			booleans[t - 1] = booleans[t];
			booleans[t] = tmp;
		}
	}

	private static void print(int[] booleans, int f) {

		short count1 = 0;
		short count2 = 0;
		short count3 = 0;

		for (double y = 0; y < booleans.length; y++) {
			System.out.print(booleans[(int) y]);
			

		}

		for (double i = 0; i < (booleans.length * 1 / 3); i++) {
			if (booleans[(int) i] == 1) {
				count1++;

			}

		}
		for (double b = (booleans.length * 1 / 3); b < (booleans.length * 2 / 3); b++) {
			if (booleans[(int) b] == 1) {
				count2++;

			}
		}
		for (double x = (booleans.length * 2 / 3); x < booleans.length - 1; x++) {
			if (booleans[(int) x] == 1) {
				count3++;
			}
		}

		System.out.print(" " + count1 + " " + count2 + " " + count3 + "\n");

	}

}
