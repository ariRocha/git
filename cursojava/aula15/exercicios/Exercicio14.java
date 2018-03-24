package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("Informa a primeira nota ");
			double nota1 =  scan.nextDouble();
			
			System.out.println("Informa a segunda nota ");
			double nota2 =  scan.nextDouble();
			
			double mediaNotas = ((nota1 + nota2)/2);

			if (mediaNotas < 4 && mediaNotas== 0) {
				System.out.println("CONCEITO E");
				} else if (mediaNotas >= 4 && mediaNotas < 6){
					System.out.println("CONCEITO D");	
				} else if (mediaNotas  >= 6  && mediaNotas  < 7.5){
					System.out.println("CONCEITO C");	
				} else if (mediaNotas  >= 7.5  && mediaNotas  < 9){
					System.out.println("CONCEITO B");	
				} else   {
					System.out.println("CONCEITO A");
				} 
	}

}
