package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;
// é necessário ter esta biblioteca para ler dados do teclado

public class NumeroInformado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe um número ");
		int numero = scan.nextInt();
		
		System.out.println("O número informado foi: " +numero);

	}

}
