package com.ariane.cursojava.aula13;

public class OperadoresL�gicos {

	public static void main(String[] args) {
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 =  (valor1 == 1) && (valor2 == 2);
		// && (e)
		System.out.println("valor1 � AND valor 2 � 2 - resultado: " + resultado1);
		
		boolean resultado2 =  (valor1 == 1) || (valor2 == 2);
		// || (ou)
		System.out.println("valor1 � OR valor 2 � 2 - resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
				
		System.out.println(verdadeiro && falso);	
		System.out.println(verdadeiro || falso);	
		System.out.println(verdadeiro ^ falso);	
		System.out.println(!verdadeiro || falso);	
		
	}

}
