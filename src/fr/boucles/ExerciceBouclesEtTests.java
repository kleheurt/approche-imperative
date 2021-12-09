package fr.boucles;

public class ExerciceBouclesEtTests {
	
	public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
	public static void afficherBoucle() {
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void afficherInverse() {
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	
	public static void afficherPlusQueTrois() {
		for (int i = 0; i<array.length; i++) {
			int x = array[i];
			if(x > 3) {
				System.out.println(x);
			}
		}
	}
	
	public static void afficherPairs() {
		for (int i = 0; i<array.length; i++) {
			int x = array[i];
			if((x % 2) == 0) {
				System.out.println(x);
			}
		}
	}
	
	public static void afficherIndexPairs() {
		for (int i = 0; i<array.length; i++) {
			if((i % 2) == 0) {
				System.out.println(array[i]);
			}
		}
	}
	
	public static void afficherImpairs() {
		for (int i = 0; i<array.length; i++) {
			int x = array[i];
			if((x % 2) != 0) {
				System.out.println(x);
			}
		}
	}
	
	public static void main(String[] args) {
		afficherBoucle();
		afficherInverse();
		afficherPlusQueTrois();
		afficherPairs();
		afficherIndexPairs();
		afficherImpairs();

		
	}

}
