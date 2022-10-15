package Ati1;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.print("Digite o primeiro numero: ");
		x = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		y = sc.nextDouble();
		
		System.out.printf("Soma             : %.2f", soma(x, y));
		System.out.printf("\nSubtraÃ§Ã£o    : %.2f",subtracao(x, y));
		System.out.printf("\nMultiplicaÃ§Ã£o: %.2f",multiplicacao(x, y));
		System.out.printf("\nDivisÃ£o       : %.2f",divisao(x, y));
		
		sc.close();
	}
	public static double soma(double x, double y) {
		double resultado = x + y;
		return resultado;
	}
	public static double subtracao(double x, double y) {
		double resultado = x - y;
		return resultado;
	}
	public static double multiplicacao(double x, double y) {
		double resultado = x * y;
		return resultado;
	}
	public static double divisao(double x, double y) {
		double resultado = x / y;
		return resultado;
	}

}

