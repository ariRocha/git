package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade vendida ");
		double infoLitros = scan.nextDouble();

		System.out.println("Qual tipo de combustível: G-gasolina ou A-álcool ");
		String infoCombustivel = scan.nextLine();

		if (infoCombustivel.equals("G") && infoLitros <= 20)
			System.out.println(
					"O tipo de combustível de combustível escolhido foi Gasolina, o valor sairá com desconto de 4%: "
							+ ((infoLitros * 2.50) - (infoLitros * 2.50) * 0.04));
		 if (infoCombustivel.equals("G") && infoLitros > 20)
			System.out.println(
					"O tipo de combustível de combustível escolhido foi Gasolina, o valor sairá com desconto de 6%: "
							+ ((infoLitros * 2.50) - (infoLitros * 2.50) * 0.06));
		if (infoCombustivel.equals("A") && infoLitros <= 20)
			System.out.println(
					"O tipo de combustível de combustível escolhido foi Álcool, o valor sairá com desconto de 3%: "
							+ ((infoLitros * 1.90) - (infoLitros * 1.90) * 0.03));
		if (infoCombustivel.equals("A") && infoLitros > 20)
			System.out.println(
					"O tipo de combustível de combustível escolhido foi Álcool, o valor sairá com desconto de 5%: "
							+ ((infoLitros * 1.90) - (infoLitros * 1.90) * 0.05));
		else {
			System.out.println("");
		}

	}

}