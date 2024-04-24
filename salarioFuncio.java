package exercicosderepeticao;

import java.util.Scanner;

public class salarioFuncio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		       int funcionario,salario=0,mediasalarial=0,sal;;

		       System.out.print("Informe quantos funcionários possui na empresa: ");
		       funcionario = ler.nextInt();

		       for (int i=1; i<=funcionario; i++) { 
		       System.out.print("Informe o salario de cada funcionário: ");
		       sal = ler.nextInt();
		       salario+= sal;
		       }
		       
		       
		       
		       mediasalarial= salario/funcionario;
		       System.out.print("A media salarial da empresa é R" + mediasalarial + "$");
		       
		       
		       ler.close(); 
	}

}
