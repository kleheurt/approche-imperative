package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		boolean alive = true;
		while(alive){
			System.out.println("Nombre ? ");
			int nb = scanner.nextInt() ;
			if(nb>=1 && nb <= 10) {
				System.out.println(nb);
				scanner.close();
				alive = false;
			}
		}
	}

}
