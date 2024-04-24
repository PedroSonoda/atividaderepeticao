package exercicosderepeticao;

import java.util.Scanner;

public class segundarepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, resultado;
		Scanner ler = new Scanner (System.in);
	
		System.out.println("Informe o número para ver a tabuada: ");
		numero = ler.nextInt();
		
		for(int i =1; i<=10; i++) {
				resultado = numero * i;
				System.out.println(numero + " X " + i + " = " + resultado + "\n");
				
	}
		ler.close();
}
}