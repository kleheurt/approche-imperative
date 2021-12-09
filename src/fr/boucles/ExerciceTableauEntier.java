package fr.boucles;

public class ExerciceTableauEntier {
	
	public static void afficherTableau() {
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
		
		//Affichage du premier élément
		System.out.println(tab[0]);
		
		//Affichage longueur du tableau
		System.out.println(tab.length);
		
		//Affichage du dernier élément
		System.out.println(tab[tab.length - 1]);
		
		//Modification élément index 4 et vérification
		tab[4] = 8;
		System.out.println(tab[4]);
	}
	
	public static void main (String[] args) {
		afficherTableau();
	}

}
