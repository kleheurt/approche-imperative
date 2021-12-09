package fr.algorithmie;
import java.lang.Math;

public class SommeDeTableauxDiff {
		
	// Renvoie un tableau de somme élément par élément quelle que soit la taille
	public static int[] somme(int[] a1, int[] a2) {
		int max = Math.max(a1.length, a2.length);
		int min = Math.min(a1.length,  a2.length);
		int[] arrayToReturn = new int[max];
		
		if(a1.length > a2.length) {
			arrayToReturn = a1;
			for(int i = 0; i < min ; i++) {
				arrayToReturn[i] += a2[i];
			}
		}
		else {
			arrayToReturn = a2;
			for(int i = 0; i < min ; i++) {
				arrayToReturn[i] += a1[i];
			}
		}
		return arrayToReturn;
	}

	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		int[] laSomme = somme(array2,array1);
		Affichage.affichage(laSomme);
	}

}
