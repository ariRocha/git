package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Insira a nota");
		
		double nota =  scan.nextDouble();
		
		if (nota < 7) {
			System.out.println("Reprovado");
			} else if (nota >= 7 && nota < 10){
				System.out.println("Aprovado");		
			} else {
				System.out.println("Aprovado com Distinção");
			}

	}

}
