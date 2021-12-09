package fr.algorithmie;

public class AffichageInverse {
	
	private static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

	public static void afficherEnsemble() {
		String s = "{ ";
		int last = array.length-1;
		for(int i = 0; i < last ; i++) {
			s += array[i];
			s += ", ";
		}
		s += array[last];
		System.out.println(s + " }\n");
	}
	
	public static void afficherInverse() {
		String s = "{ ";
		for(int i = array.length-1; i > 0 ; i--) {
			s += array[i];
			s += ", ";
		}
		s += array[0];
		System.out.println(s + " }\n");
	}
	
	public static void copie() {
		int[] arrayCopy = array;
	}
	
	public static void main(String[] args) {
		afficherEnsemble();
		afficherInverse();
		copie();
	}

}
