package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
	
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Quanto você ganha por hora trabalhada? ");
		double valor = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou neste mês? ");
		double horas = scan.nextDouble();
		
		
		Double salario = valor * horas;
		System.out.print("Seu salário neste mês foi de: " + salario + " reais" );
		
	}

}
