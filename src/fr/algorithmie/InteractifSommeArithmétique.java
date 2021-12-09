package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmétique {
	
	static int calculerSomme(int x) {
		int acc = 0;
		for(int i = 1; i <= x; i++) {
			acc += i;
		}
		return acc;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
			System.out.println("Nombre ? ");
			int nb = scanner.nextInt() ;
			System.out.println(calculerSomme(nb));
			scanner.close();
	}

}
