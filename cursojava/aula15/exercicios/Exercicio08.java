package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Insira o valor do primeiro produto: ");
		double valor1 =  scan.nextDouble();
		
		System.out.println("Insira o valor do segundo produto");
		double valor2 =  scan.nextDouble();
		
		System.out.println("Insira o valor do terceiro produto");
		double valor3 =  scan.nextDouble();
		
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("Compre o primeiro produto que custa " + valor1 + " reais");
			} else if (valor2 < valor1  && valor2 < valor3){
				System.out.println(" Compre o segundo produto que custa " + valor2 + " reais ");		
			} else {
				System.out.println(" Compre o terceiro produto que custa " + valor3 + " reais" );	
			}
	}
}