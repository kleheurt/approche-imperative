package fr.algorithmie;

public class SommeDeTableaux {
	
	//Renvoie un tableau de somme élément par élément
	public static int[] somme(int[] a1, int[] a2) {
		int[] arrayToReturn = new int[a1.length];
		for(int i = 0; i < a1.length ; i++) {
			arrayToReturn[i] = a1[i] + a2[i];
		}
		return arrayToReturn;
	}

	public static void main(String[] args) {
		int[] a1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] a2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
	
		int[] laSomme = somme(a1,a2);
		Affichage.affichage(laSomme);
	
	}

}
