package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	private static final String SOMA = null;

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
		System.out.println(" Informe um n�mero: ");
		double numero1 =  scan.nextDouble();
		
		System.out.println(" Informe outro n�mero: ");
		double numero2 =  scan.nextDouble();
		
		System.out.println(" Qual opera��o: SOMA, SUBTRA��O, DIVIS�O OU MULTIPLICA��O? ");
		String operacao =  scan.next();
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double divisao = numero1 / numero2;
		double multiplicacao = numero1 * numero2;
		
        // opera��o
		
		if (operacao.equals("SOMA")) {
			System.out.println("O resultado da opera��o �: " + soma );
		} else if (operacao.equals("SUBTRA��O")){
			System.out.println("O resultado da opera��o �: " + subtracao);	
		} else if (operacao.equals("DIVIS�O")){
			System.out.println("O resultado da opera��o �: " + divisao);	
		}else if (operacao.equals("MULTIPLICA��O")){
			System.out.println("O resultado da opera��o �: " + multiplicacao);	
		}else {System.out.println("Opera��o n�o decidida");
			} 
		
		// positivo ou negativo
		
		if (operacao.equals("SOMA") && soma > 0) {
			System.out.println("O resultado � positivo");
		} else if (operacao.equals("SUBTRA��O") & subtracao > 0){
			System.out.println("O resultado da opera��o");	
		} else if (operacao.equals("DIVIS�O") && divisao > 0){
			System.out.println("O resultado � positivo");	
		}else if (operacao.equals("MULTIPLICA��O") && multiplicacao >0){
			System.out.println("O resultado � positivo");	 	
		}else {System.out.println("O resultado � negativo");
			} 
		
		 // par ou �mpar
		
		if (operacao.equals("SOMA") && soma%2 == 0) {
			System.out.println("O resultado � par");
		} else if (operacao.equals("SUBTRA��O") & subtracao%2 == 0){
			System.out.println("O resultado � par");	
		} else if (operacao.equals("DIVIS�O") && divisao%2 == 0){
			System.out.println("O resultado � par");	
		}else if (operacao.equals("MULTIPLICA��O") && multiplicacao%2 == 0){
			System.out.println("O resultado � par");	 	
		}else {System.out.println("O resultado � �mpar");
			} 
		
	}

}
