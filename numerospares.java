package exercicosderepeticao;

import java.util.Scanner;

public class numerospares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int numero;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o valor: ");
		numero = ler.nextInt();
		
		for (int i =numero; i<=numero; i++ ) {
			if (numero % 2 == 0)
				System.out.println("O numero é par");
			else 
				System.out.println("O numero é impar");
		}
		ler.close();
	}
}
