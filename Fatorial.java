package exercicosderepeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = ler.nextInt();

		int fato = 1;


		for (int i = 1; i <= num; i++) {
			fato *= i;
		}

		System.out.println("O fatorial de " + num + " é: " + fato);

		ler.close();

	}

}
