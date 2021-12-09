import java.util.Scanner;

public class InteractifFibonnaci {
	
	
	static int calculFibo(int rang) {
		switch(rang) {
		case 0 : return 0;
		case 1 : return 1;
		default : return calculFibo(rang - 1) + calculFibo(rang - 2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Rang ?");
		int rang = scanner.nextInt();
		System.out.println(calculFibo(rang));
		scanner.close();
		
	}

}
