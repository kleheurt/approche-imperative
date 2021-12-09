package fr.algorithmie;

public class FabriquerMur {
	public static void main(String[] args) {
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}
	
	// Calcul la somme des éléments d'un tableau
	static int somme(int[] arr) {
		int compteur = 0;
		for(int i = 0; i < arr.length ; i++) {
			compteur += arr[i];
		}
		return compteur;
	}
	
	// Produit un tableau des différentes longueurs de briques proposées au test
	static int[] tableauBriques(int nbSmall, int nbBig) {
		int[] arrayToReturn = new int[nbSmall+nbBig];
		for(int i = 0; i < nbSmall ; i++) {
			arrayToReturn[i] = 1;
		}
		for(int j = nbSmall; j < (nbSmall+nbBig); j++) {
			arrayToReturn[j] = 5;
		}
		return arrayToReturn;
	}
	
	// Tester un vecteur de briques vs la longueur en paramètre
	static boolean testerElement(int[] arr, int longueur) {
		return somme(arr) == longueur;
	}
	
	// Tester un vecteur et ses sous-vecteurs (retrait récursif du dernier élément)
	// ex : {1,2,3}, {1,2}, {1}
	static boolean testerGroupe(int[] arr, int longueur) {
		if(testerElement(arr,longueur)) {
			return true;
		}
		else if(arr.length <= 1){
			return false;
		}
		else {
			int[] subArray = new int[arr.length-1];
			for(int i = 0; i < arr.length-1 ; i++) {
				subArray[i] = arr[i];
			}
			return testerGroupe(subArray,longueur);
		}
	}
	
	// Tester l'ensemble des combinaisons de briques possibles
	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		int[] briques = tableauBriques(nbSmall, nbBig);
		int nbRotations = briques.length;
		
		for(int i=0; i<nbRotations ;i++) {
			if(testerGroupe(briques,longueur)){
				return true;
			}
			else {
				briques = Rotation.rotation(briques);
			}
		}
		return false;
	}
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}
}
