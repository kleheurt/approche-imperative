package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Nombre 1 ? ");
		int nb = scanner.nextInt() ;
		
		for(int i = 2; i<= 10 ; i++) {
			System.out.println("Nombre "+i+" ? ");
			int tmp = scanner.nextInt();
			if(tmp > nb) {
				nb = tmp;
			}
		}
		
		System.out.println("Plus grand nombre saisi : "+nb);
		scanner.close();
	}

}
