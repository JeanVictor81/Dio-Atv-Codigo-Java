package Ati1;
import java.util.Scanner;

public class Dia {
	static final int DIA = 12;
	static final int TARDE = 18;
	static final int NOITE = 24;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a hora: ");
		int hora = sc.nextInt(); 
		if(hora > 24 || hora < 0) {
			System.out.println("Hora invalida");
		}
		else {
			System.out.println(saudação(hora));
		}
		sc.close();
	}
	public static String saudação(int hora) {
		String resultado = "Bom dia";
		if(hora >= DIA && hora <= TARDE ) {
			resultado = "Boa tarde";
		}
		else if(hora > TARDE && hora <= NOITE){
			resultado = "Boa noite";
		}
		
		return resultado;
	}
}
