package fr.algorithmie;

public class ComparaisonTableau {
	
	public static int comparer(int[] a1, int[] a2) {
		int compteur = 0;
		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a2.length; j++) {
				if(a1[i] == a2[j]) {
					compteur++;
				}
			}
		}
		return compteur;
	}

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int compteur = comparer(array2,array1);
		System.out.println("Il y a "+compteur+" éléments en commun.");
	}
}
