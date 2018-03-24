package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class ConversaoValores {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a medida em metros ");
		double medida = scan.nextDouble();
		// utilza-se double para uso de valores decimais

		System.out.println("A medida convertida é: " + (medida)*100 + " centimetros");
		
	
			
		
	}

}
