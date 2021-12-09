package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
	
	static void afficherSuivant(int x) {
		int[] arr = new int[10];
		for(int i = 1; i <= 10; i++) {
			arr[i-1] = x+i;
		}
		Affichage.affichage(arr);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
			System.out.println("Nombre ? ");
			int nb = scanner.nextInt() ;
			afficherSuivant(nb);
			scanner.close();
	}

}
