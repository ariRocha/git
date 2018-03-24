package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	private static final String SOMA = null;

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
		System.out.println(" Informe um número: ");
		double numero1 =  scan.nextDouble();
		
		System.out.println(" Informe outro número: ");
		double numero2 =  scan.nextDouble();
		
		System.out.println(" Qual operação: SOMA, SUBTRAÇÃO, DIVISÃO OU MULTIPLICAÇÃO? ");
		String operacao =  scan.next();
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double divisao = numero1 / numero2;
		double multiplicacao = numero1 * numero2;
		
        // operação
		
		if (operacao.equals("SOMA")) {
			System.out.println("O resultado da operação é: " + soma );
		} else if (operacao.equals("SUBTRAÇÃO")){
			System.out.println("O resultado da operação é: " + subtracao);	
		} else if (operacao.equals("DIVISÃO")){
			System.out.println("O resultado da operação é: " + divisao);	
		}else if (operacao.equals("MULTIPLICAÇÃO")){
			System.out.println("O resultado da operação é: " + multiplicacao);	
		}else {System.out.println("Operação não decidida");
			} 
		
		// positivo ou negativo
		
		if (operacao.equals("SOMA") && soma > 0) {
			System.out.println("O resultado é positivo");
		} else if (operacao.equals("SUBTRAÇÃO") & subtracao > 0){
			System.out.println("O resultado da operação");	
		} else if (operacao.equals("DIVISÃO") && divisao > 0){
			System.out.println("O resultado é positivo");	
		}else if (operacao.equals("MULTIPLICAÇÃO") && multiplicacao >0){
			System.out.println("O resultado é positivo");	 	
		}else {System.out.println("O resultado é negativo");
			} 
		
		 // par ou ímpar
		
		if (operacao.equals("SOMA") && soma%2 == 0) {
			System.out.println("O resultado é par");
		} else if (operacao.equals("SUBTRAÇÃO") & subtracao%2 == 0){
			System.out.println("O resultado é par");	
		} else if (operacao.equals("DIVISÃO") && divisao%2 == 0){
			System.out.println("O resultado é par");	
		}else if (operacao.equals("MULTIPLICAÇÃO") && multiplicacao%2 == 0){
			System.out.println("O resultado é par");	 	
		}else {System.out.println("O resultado é ímpar");
			} 
		
	}

}
