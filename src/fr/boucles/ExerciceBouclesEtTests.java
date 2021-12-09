package fr.boucles;

public class ExerciceBouclesEtTests {
	
	private int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	
	public void afficherBoucle() {
		for (int i = 0; i<this.array.length; i++) {
			System.out.println(this.array[i]);
		}
	}
	
	public void afficherInverse() {
		for(int i = this.array.length - 1; i >= 0; i--) {
			System.out.println(this.array[i]);
		}
	}
	
	public void afficherPlusQueTrois() {
		for (int i = 0; i<this.array.length; i++) {
			int x = this.array[i];
			if(x > 3) {
				System.out.println(x);
			}
		}
	}
	
	public void afficherPairs() {
		for (int i = 0; i<this.array.length; i++) {
			int x = this.array[i];
			if((x % 2) == 0) {
				System.out.println(x);
			}
		}
	}
	
	public void afficherIndexPairs() {
		for (int i = 0; i<this.array.length; i++) {
			if((i % 2) == 0) {
				System.out.println(this.array[i]);
			}
		}
	}
	
	public void afficherImpairs() {
		for (int i = 0; i<this.array.length; i++) {
			int x = this.array[i];
			if((x % 2) != 0) {
				System.out.println(x);
			}
		}
	}
	

}
