package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio17 {
	//
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println(" Informe o ano ");
			int ano =  scan.nextInt();
			
            // Os anos bissextos s�o m�ltiplos de 4, n�o m�ltiplos de 100 (1900 n�o � bissexto) 
			//e m�ltiplos de 400 (2000 � bissexto).
			
			if ( (ano%4 == 0 && ano%100!=0) || (ano%400 == 0)){
					System.out.println(" O ano � bissexto");	
				} 
				 else  {
					System.out.println(" O ano n�o � bissexto");
				}

	}

}
