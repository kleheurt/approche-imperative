package fr.algorithmie;

public class FirstLast {
	
	public static boolean valorisation(int[] arr) {
		return (arr.length != 0)&&(arr[0] == arr[arr.length-1]);
	}

	public static void main(String[] args) {
		int[] array = {6,2,3,4,6,7,8,9,6};
		System.out.println(valorisation(array));
	}

}
