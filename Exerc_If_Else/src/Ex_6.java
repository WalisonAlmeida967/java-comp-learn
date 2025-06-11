import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo de Imposto de Renda");
		System.out.println("Ensira seu salário:");
		
		double x = sc.nextDouble();
		
		double z = 2000;
		double c = 3000;
		double v = 4500;
		
		if (x < z) {
			System.out.println("Isento de Pagar");
		}
		else {
		if (x > z && x <= c) {
				double PAGAR = (x*0.08);
				System.out.printf("Valor a ser PAGO: R$%.2f%n", PAGAR);
			}
			else {
				if (x > c && x < v) {
					double MAMACO  = (x*0.1);
					System.out.printf("Valor a ser PAGO R$%.2f%n", MAMACO);
				}
				else {
					double GIRAFA  = (x*0.2);
					System.out.printf("Valor a ser PAGO R$%.2f%n", GIRAFA);
				}
			}
		}
		
		sc.close();
	}

}
