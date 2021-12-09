package fr.algorithmie;

public class AffichageSuite {
	
	public static void afficherDix() {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("\n");
	}
	
	public static void afficherPairs() {
		int i = 0;
		while(i <= 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("\n");
	}
	
	public static void afficherImpairs() {
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		afficherDix();
		afficherPairs();
		afficherImpairs();
	}

}
