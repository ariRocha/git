package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o sexo (F ou M): ");
		String infoSexo = scan.nextLine();
	
		if (infoSexo.equals("F")) {
			System.out.println("Feminino");
			} else if (infoSexo.equals("M")) {
				System.out.println("Masculino");	
			} else {
				System.out.println("Sexo inválido");	
			}
		
		
	}

}


