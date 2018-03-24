package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio17 {
	//
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println(" Informe o ano ");
			int ano =  scan.nextInt();
			
            // Os anos bissextos são múltiplos de 4, não múltiplos de 100 (1900 não é bissexto) 
			//e múltiplos de 400 (2000 é bissexto).
			
			if ( (ano%4 == 0 && ano%100!=0) || (ano%400 == 0)){
					System.out.println(" O ano é bissexto");	
				} 
				 else  {
					System.out.println(" O ano não é bissexto");
				}

	}

}
