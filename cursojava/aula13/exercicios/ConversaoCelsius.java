package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class ConversaoCelsius {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Farenheit: ");
		double tempFarenheit = scan.nextDouble();
		
		double tempCelsius = 5* (tempFarenheit-32)/9 ;
	
		System.out.println("A temperatura em Celsius é: " + tempCelsius);
	}

}
