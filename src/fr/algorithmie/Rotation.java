package fr.algorithmie;

public class Rotation {
	
	public static int[] rotation(int[] arr) {
		int l = arr.length;
		int[] arrayToReturn = new int[l];
		arrayToReturn[0] = arr[l-1];
		for(int i = 0; i<l-1;i++) {
			arrayToReturn[i+1] = arr[i];
		}
		return arrayToReturn;
	}

	public static void main(String[] args) {
		int[] array = {0,1,2,3};
		System.out.println("Nouveau tableau :");
		Affichage.affichage(rotation(array));
	}

}
