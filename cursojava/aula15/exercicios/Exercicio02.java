package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
        System.out.println("Informe um valor: ");
        double infoValor =  scan.nextDouble();
		
		
		if (infoValor > 0 ) {
			System.out.println(" O valor é positivo" ); }
			else {
				System.out.println(" O valor é negativo"  );
			}
		
		
		
		
		
	}

}