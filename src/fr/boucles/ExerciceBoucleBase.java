package fr.boucles;

public class ExerciceBoucleBase {
	
	public void afficherNombres() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
	}
	
	public void afficherNom() {
		for(int i = 0; i < 20; i++) {
			System.out.println("Le Heurt Kévin");
		}
	}
	
	public void afficherPairs() {
		for(int i = 1; i <= 50; i++) {
			System.out.println(i*2);
		}
	}
	
	public void afficherImpairs() {
		for(int i = 1; i <= 50 ; i++) {
			System.out.println(i*2-1);
		}
	}
	
}
