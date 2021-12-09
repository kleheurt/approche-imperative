package fr.algorithmie;

public class InversionContenu {
	
	//Renvoie un tableau en ordre inverse
	public static int[] copie(int[] arrayToCopy) {
		int l = arrayToCopy.length;
		int[] arrayToReturn = new int[l];
		int j = 0;
		for(int i = l-1; i >= 0; i--) {
			arrayToReturn[j] = arrayToCopy[i];
			j++;
		}
		return arrayToReturn;
	}

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = copie(array);
		Affichage.affichage(array);
		Affichage.affichage(arrayCopy);
		
	}

}
