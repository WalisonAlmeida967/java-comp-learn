import java.util.Scanner;

public class Ex_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Localização de Matrizes");
		System.out.println("Ensira a Váriavel X:");
		double x = sc.nextDouble();
		
		System.out.println("Ensira a Váriavel Y:");
		double y = sc.nextDouble();
		
		if (x >= 0 && y >= 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y >= 0) {
			System.out.println("Q2");
		}
		else if (x >= 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}

		sc.close();
	}
}
