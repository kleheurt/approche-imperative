package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	
	static void tableMult(int x) {
		for(int i = 0; i <= 10; i++) {
			System.out.println(x + " * " + i + " = " + x*i);
		}
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		boolean alive = true;
		while(alive){
			System.out.println("Nombre ? ");
			int nb = scanner.nextInt() ;
			if(nb>=1 && nb <= 10) {
				tableMult(nb);
				scanner.close();
				alive = false;
			}
		}
	}

}
