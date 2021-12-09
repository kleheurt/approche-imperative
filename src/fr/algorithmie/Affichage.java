package fr.algorithmie;

public class Affichage {
	
	//Affichage tout tableau
		public static void affichage(int[] arrayToDisplay) {
			String s = "{ ";
			int last = arrayToDisplay.length-1;
			for(int i = 0; i < last ; i++) {
				s += arrayToDisplay[i];
				s += ", ";
			}
			s += arrayToDisplay[last];
			System.out.println(s + " }\n");
		}

}
