package fr.declaration.variable;
import fr.boucles.ExerciceBoucleBase;
import fr.boucles.ExerciceTableauEntier;
import fr.boucles.ExerciceBouclesEtTests;

public class DeclarationApp {
	
	public static void main(String[] args) {
		//TP 02
		byte by = 11;
		short s = 12;
		int i = 13;
		long l = 14L;
		float f = 1.5F;
		double d = 1.6;
		char c = 'c';
		boolean bo = true;
		String str = "chaine";
		System.out.println(str);
		
		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		System.out.println(randomString);
		randomString =  randomString.substring(0,31)+"\n"+randomString.substring(31);
		System.out.println(randomString);
				
		ExerciceBoucleBase e1 = new ExerciceBoucleBase();
		ExerciceTableauEntier e2 = new ExerciceTableauEntier();
		ExerciceBouclesEtTests e3 = new ExerciceBouclesEtTests();
		
		e1.afficherNombres();
		e2.afficherTableau();
		e3.afficherImpairs();

	}

}
