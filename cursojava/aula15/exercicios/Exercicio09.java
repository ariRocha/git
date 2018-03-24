package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Insira o primeiro valor");
		double valor1 =  scan.nextDouble();
		
		System.out.println("Insira o segundo valor");
		double valor2 =  scan.nextDouble();
		
		System.out.println("Insira o terceio valor");
		double valor3 =  scan.nextDouble();
		
		// valor maior
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println(valor1);
			} else if (valor2 > valor1  && valor2 > valor3){
				System.out.println(valor2);		
			} else {
				System.out.println(valor3);	
			}
		
		// valor mediano
		
		if (valor1 > valor2 && valor1 > valor3 && valor2 > valor1  && valor2 > valor3) {
			System.out.println(valor3);
			} else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor1  && valor3 > valor2){
				System.out.println(valor2);		
			} else {
				System.out.println(valor3);	
			}
		
		// menor valor
		
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println(valor1);
			} else if (valor2 < valor1  && valor2 < valor3){
				System.out.println(valor2);		
			} else {
				System.out.println(valor3);	
			}
	}

}

>>> terminar