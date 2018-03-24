package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
        System.out.println("Informe o primeiro valor: ");
		int primeiroValor = scan.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int segundoValor = scan.nextInt();
		
		if (primeiroValor > segundoValor) {
			System.out.println(" O maior valor é: " + primeiroValor); }
			else {
				System.out.println(" O maior valor é: " + segundoValor);
			}
		
		
		
		
		
	}

}
