package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe um n�mero ");
		int numero1 = scan.nextInt();
		// utilza-se float para uso de valores decimais
		
		System.out.println("Informe outro n�mero ");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma dos n�meros �: " + (numero1 + numero2));
	
		
		
		
	}

}
