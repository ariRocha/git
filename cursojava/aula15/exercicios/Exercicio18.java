package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Informe um n�mero ");
		int numero =  scan.nextInt();
		
		if ( numero%2 == 0){
			System.out.println(" O n�mero � par");	
		} 
		 else  {
			System.out.println(" O n�mero � �mpar");
		}

	}

}
