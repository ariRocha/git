package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
	
        Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		//int area = lado * lado;
		double area = Math.pow(lado, 2);
		
		System.out.println(" A �rea do quadrado �: " + area);
		System.out.println(" O dobro da �rea do quadrado �: " + (area*2));
			
	}

}
