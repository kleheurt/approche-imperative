package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		//tirage d'un int pseudo-aléatoire inférieur à 100 et différend de 0
		Random rand = new Random();
		int nb = 0;
		while(nb == 0) { 
			nb = rand.nextInt(101);
		}
		
		int cpt = 1;
		Scanner scanner = new Scanner(System.in) ;
		boolean alive = true;
		
		while(alive) {
			System.out.println("Nombre ? ");
			int tmp = scanner.nextInt();
			if(tmp == nb) {
				alive = false;
			}
			else {
				cpt++;
				if(tmp > nb) {
					System.out.println("C'est moins !");
				}
				else {
					System.out.println("C'est plus !");
				}
			}
		}
		
		System.out.println("Vous avez trouvé suite à "+cpt+" essai.");
		scanner.close();

	}

}
