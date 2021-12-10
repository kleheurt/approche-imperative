package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {
	
	//retourne un entier entre 1 et 3
	static int tirage(int batons) {
		switch(batons) {
		case 1 : return 1;
		case 2 : return 1;
		case 3 : return 2;
		default :
			Random rand = new Random();
			return rand.nextInt(3)+1;
		}
	}
	
	// contrôle la saisie du nombre de bâtons
	static int saisieSecure(Scanner scanner) {
		while(true) {
			int y = scanner.nextInt();
			if((y >= 1) && (y <= 3 )) return y;
			System.out.println("Saisissez un nombre compris entre 1 et 3 !");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Jeu des 21 Bâtons");
		
		boolean alive = true;
		boolean main = false;
		while(alive) {
			System.out.println(" (1) Pour prendre la main");
			System.out.println(" (2) Sinon ");
			int choix = scanner.nextInt();
			switch(choix) {
			case 1:
				System.out.println("Vous commencez");
				main = true;
				alive = false;
				break;
			case 2:
				System.out.println("L'ordinateur commence");
				alive = false;
				break;
			}
		}
		
		int batons = 21;
		if(main) {
			System.out.println("Combien de bâtons souhaitez vous prendre ? [1 à 3]");
			int y = saisieSecure(scanner);
			batons -= y;
		}
		
		alive = true;
		while(alive) {
			int x = tirage(batons);
			System.out.println("L'ordinateur prend "+x+" bâtons.");
			batons -= x;
			System.out.println("Il reste "+batons+" bâtons en jeu.");
			switch(batons) {
			case 0 :
				System.out.println("Bravo, c'est gagné.");
				alive = false;
				break;
			case 1 :
				System.out.println("Vous avez perdu.");
				alive = false;
				break;
			default:
				System.out.println("Combien de bâtons souhaitez vous prendre ? [1 à 3]");
				int y = saisieSecure(scanner);
				batons -= y;
			}
		}
		scanner.close();

	}

}
