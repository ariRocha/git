package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double lado1;
		double lado2;
		double lado3;
		
		System.out.println("Informe o valor do primeiro lado ");
		lado1 =  scan.nextDouble();
		
		System.out.println("Informe o valor do segundo lado ");
		lado2 =  scan.nextDouble();

		System.out.println("Informe o valor do terceiro lado ");
		lado3 =  scan.nextDouble();
		
	
	    
		if ((lado1 + lado2) > lado3 && (lado1+lado3) > lado2 && (lado2 + lado3) > lado1 ) {
			System.out.println("Os valores são de um triângulo");
			} 
		
		
		if ( lado1 == lado3 && lado1 == lado2 && lado2 == lado3){
				System.out.println("do tipo equilátero");	
			} else if ( lado1 != lado2 && lado1!=lado3 && lado2 != lado3){
				System.out.println("do tipo escaleno");	
			} else {
				System.out.println("do tipo isósceles");
			}
	    
	    }
	    
	    
}
	
