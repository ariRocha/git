package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;
// � necess�rio ter esta biblioteca para ler dados do teclado

public class NumeroInformado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe um n�mero ");
		int numero = scan.nextInt();
		
		System.out.println("O n�mero informado foi: " +numero);

	}

}
