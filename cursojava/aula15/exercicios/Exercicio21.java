package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade vendida ");
		double infoLitros = scan.nextDouble();

		System.out.println("Qual tipo de combust�vel: G-gasolina ou A-�lcool ");
		String infoCombustivel = scan.nextLine();

		if (infoCombustivel.equals("G") && infoLitros <= 20)
			System.out.println(
					"O tipo de combust�vel de combust�vel escolhido foi Gasolina, o valor sair� com desconto de 4%: "
							+ ((infoLitros * 2.50) - (infoLitros * 2.50) * 0.04));
		 if (infoCombustivel.equals("G") && infoLitros > 20)
			System.out.println(
					"O tipo de combust�vel de combust�vel escolhido foi Gasolina, o valor sair� com desconto de 6%: "
							+ ((infoLitros * 2.50) - (infoLitros * 2.50) * 0.06));
		if (infoCombustivel.equals("A") && infoLitros <= 20)
			System.out.println(
					"O tipo de combust�vel de combust�vel escolhido foi �lcool, o valor sair� com desconto de 3%: "
							+ ((infoLitros * 1.90) - (infoLitros * 1.90) * 0.03));
		if (infoCombustivel.equals("A") && infoLitros > 20)
			System.out.println(
					"O tipo de combust�vel de combust�vel escolhido foi �lcool, o valor sair� com desconto de 5%: "
							+ ((infoLitros * 1.90) - (infoLitros * 1.90) * 0.05));
		else {
			System.out.println("");
		}

	}

}