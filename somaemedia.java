package exercicosderepeticao;

import java.util.Scanner;

public class somaemedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero,media,soma=0;
		Scanner ler = new Scanner (System.in);

		for (double i=0; i<=4; i++) {
			System.out.println("Informe a nota:");
			numero= ler.nextDouble();
			soma += numero;
		}
		media = soma /5;
		System.out.println("sua media é" + media);
	ler.close();
	}
	
}
