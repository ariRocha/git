package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CalculoNumero {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o primeiro número inteiro: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Informe o terceiro número real: ");
		double terceiroNumero = scan.nextDouble();

	    //produtoA= produto do dobro do primeiro com metade do segundo
		int produtoA = (primeiroNumero*2) *(segundoNumero/2); 
		System.out.println("Produto do dobro do primeiro com metade do segundo: " + produtoA);
		
		// soma do triplo do primeiro com o terceiro
		double produtoB = (primeiroNumero*3) + terceiroNumero;
		System.out.println("Soma do triplo do primeiro com o terceiro " + produtoB);
		
		// terceiro elevado ao cubo
		
		double produtoC = terceiroNumero * terceiroNumero * terceiroNumero;
		System.out.println("Terceiro elevado ao cubo " + produtoC);
		
	}

}
