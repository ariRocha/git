package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class ConversaoFarenheit {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double tempCelsius = scan.nextDouble();
		
		double tempFarenheit = 9*(tempCelsius)/5 + 32;
	
		System.out.println("Informe a temperatura em Farenheit é: " + tempFarenheit);
	}

}
