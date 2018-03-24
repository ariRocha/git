package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o turno que você estuda (M, T ou N): ");
		String infoTurno = scan.nextLine();
	
		if (infoTurno.equals("M") ) {
			System.out.println("Bom dia");
			} else if (infoTurno.equals("T")) {
				System.out.println("Boa Tarde ");	
			} else if (infoTurno.equals("N")) {
				System.out.println("Boa Noite ");	
			}else {
				System.out.println("Turno inválido");	
			}
		
		
	}

}