package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário a seguir: ");
		float salario = sc.nextFloat();
		double porcentagem = (salario*30)/100;
		double salariocaumento = (salario+porcentagem);
		 if (salario<=500.0) {
			 System.out.println("Parabéns! Voce tem direito ao aumento, seu salario agora é: " + salariocaumento);
		 } else {
			 System.out.println("Infelizmente, voce nao tem direito ao aumento.");
		 }
	}

}
