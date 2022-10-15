package Ati1;

public class Calculadora2 {
	public static void soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		System.out.printf("Soma         : %.2f", resultado);
	}
	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		System.out.printf("\nSubtração    : %.2f", resultado);
	}
	public static void multiplicacao(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		System.out.printf("\nMultiplicação: %.2f", resultado);
	}
	public static void divisao(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		System.out.printf("\nDivisão      : %.2f", resultado);
	}
	
}
