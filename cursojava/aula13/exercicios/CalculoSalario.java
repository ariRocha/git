package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
	
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Quanto voc� ganha por hora trabalhada? ");
		double valor = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou neste m�s? ");
		double horas = scan.nextDouble();
		
		
		Double salario = valor * horas;
		System.out.print("Seu sal�rio neste m�s foi de: " + salario + " reais" );
		
	}

}
