package fr.algorithmie;

public class FirstLast6 {
	
	public static boolean valorisation(int[] arr) {
		return ((arr.length !=0)&&(arr[0] == 6 || arr[arr.length-1] == 6));
	}

	public static void main(String[] args) {
		int[] array = {0,2,3,4,6,7,8,9,6};
		System.out.println(valorisation(array));
	}

}
