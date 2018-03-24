package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		double pagMaca;
		double pagMorango;
		double precoFinal;
		double kgFinal;

		Scanner scan = new Scanner(System.in);

		System.out.println("Você deseja comprar quantos quilos de morangos? ");
		double kgMorango = scan.nextDouble();
		System.out.println("Você deseja comprar quantos quilos de  maçãs? ");
		double kgMaca = scan.nextDouble();

		if (kgMaca < 5) {
		   pagMaca = kgMaca * 1.80; }
		   else   {
			pagMaca = kgMaca * 1.50; }
		
		if (kgMorango < 5) {
			pagMorango = kgMorango * 2.50; }
		    else  {
			pagMorango = kgMorango * 2.20; }
	
		precoFinal = (pagMaca + pagMorango );
		kgFinal = (kgMorango + kgMaca);

		if ((precoFinal > 25) || (kgFinal > 8))
			precoFinal = (precoFinal - precoFinal * 0.1);

		System.out.println("O valor ficará em " + precoFinal + "reais");

	}

}
