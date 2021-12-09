package fr.boucles;

public class ExerciceBoucleBase {
	
	public static void afficherNombres() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
	}
	
	public static void afficherNom() {
		for(int i = 0; i < 20; i++) {
			System.out.println("Le Heurt Kévin");
		}
	}
	
	public static void afficherPairs() {
		for(int i = 1; i <= 50; i++) {
			System.out.println(i*2);
		}
	}
	
	public static void afficherImpairs() {
		for(int i = 1; i <= 50 ; i++) {
			System.out.println(i*2-1);
		}
	}
	
	public static void main(String[] args) {
		afficherNombres();
		afficherNom();
		afficherPairs();
		afficherImpairs();
		
	}

	
}
