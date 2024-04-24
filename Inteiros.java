package exercicosderepeticao;

import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero=0,somapar = 0,somaimpar = 0;
		Scanner ler = new Scanner (System.in);

		for (double i=1; i<=9; i++) {
			System.out.println("Informe o numero:");
			numero= ler.nextDouble();
			if (numero % 2 == 0) {
				System.out.println("O numero é par");
				somapar++;
			}
			else {
				System.out.println("O numero é impar");
				somaimpar++;
			}
		}
		System.out.println("a quantidade numeros pares é: "+ somapar);
		System.out.println("a quantidade numeros impares é: "+ somaimpar);
		ler.close();
	}
}
