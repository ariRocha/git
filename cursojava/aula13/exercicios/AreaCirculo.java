package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o raio do c�rculo: ");
		double raio = scan.nextDouble();
		
		//double area = 3.14159*raio*raio;
		
		double area = Math.PI *Math.pow(raio, 2);
		System.out.println(" A �rea do  c�rculo �: " + area);
		
	}

}