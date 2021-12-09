package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
	
	public static void afficherMenu() {
		System.out.println(" (1) Ajouter un nombre");
		System.out.println(" (2) Afficher les nombres existants ");
		System.out.println(" ================================== ");
	}

	public static int[] ajouterNombre(int nb, int[] arr) {
		int[] arrayToReturn = new int[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			arrayToReturn[i] = arr[i];
		}
		arrayToReturn[arr.length] = nb;
		return arrayToReturn;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		int[] arr = new int[0];
		boolean alive = true;
		while(alive) {
			afficherMenu();
			int opt = scanner.nextInt();
			if(opt == 1) {
				System.out.println("Nombre ? ");
				int nb = scanner.nextInt();
				arr = ajouterNombre(nb,arr);
			}
			else if(opt == 2) {
				if(arr.length == 0) {
					System.out.println("Aucun nombre en mémoire");
				}
				else {
				Affichage.affichage(arr);
				}
			}
			System.out.println("\n");
		}
		scanner.close();
	}

}
