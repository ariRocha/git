package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Insira o primeiro valor");
		double valor1 =  scan.nextDouble();
		
		System.out.println("Insira o segundo valor");
		double valor2 =  scan.nextDouble();
		
		System.out.println("Insira o terceio valor");
		double valor3 =  scan.nextDouble();
		
		//maior entre eles
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor é " + valor1);
			} else if (valor2 > valor1  && valor2 > valor3){
				System.out.println(" O maior valor é " + valor2);		
			} else {
				System.out.println(" O maior valor é " + valor3);	
			}
		
		// menor entre eles
		
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("O menor valor é " + valor1);
			} else if (valor2 < valor1  && valor2 < valor3){
				System.out.println(" O menor valor é " + valor2);		
			} else {
				System.out.println(" O menor valor é " + valor3);	
			}
	}

}