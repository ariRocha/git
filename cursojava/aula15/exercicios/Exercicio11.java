package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe seu sal�rio");
		
		double salarioSemAjuste=  scan.nextDouble();
			
		if (salarioSemAjuste <= 280) {
			System.out.println(" Seu sal�rio sem ajuste � " + salarioSemAjuste + " reais");
			System.out.println(" Receber� 20% de aumento ");
			System.out.println(" Valor do aumento ser� de: " + salarioSemAjuste*0.2 + " reais");
			System.out.println(" Valor final do seu sal�rio ser� de : " + (salarioSemAjuste*0.2 + salarioSemAjuste) + " reais");
			} else if (salarioSemAjuste >  280 && salarioSemAjuste <= 700) {
				System.out.println(" Seu sal�rio sem ajuste � " + salarioSemAjuste + " reais");
				System.out.println(" Receber� 15% de aumento ");
				System.out.println(" Valor do aumento ser� de: " + salarioSemAjuste*0.15 + " reais");
				System.out.println(" Valor final do seu sal�rio ser� de : " + (salarioSemAjuste*0.15 + salarioSemAjuste) + " reais");		
			} else if (salarioSemAjuste >  700  && salarioSemAjuste <= 1500) {
				System.out.println(" Seu sal�rio sem ajuste � " + salarioSemAjuste + " reais");
				System.out.println(" Receber� 10% de aumento ");
				System.out.println(" Valor do aumento ser� de: " + salarioSemAjuste*0.1 + " reais");
				System.out.println(" Valor final do seu sal�rio ser� de : " + (salarioSemAjuste*0.1 + salarioSemAjuste) + " reais");		
			}
			else {
				System.out.println(" Seu sal�rio sem ajuste � " + salarioSemAjuste + " reais");
				System.out.println(" Receber� 5% de aumento ");
				System.out.println(" Valor do aumento ser� de: " + salarioSemAjuste*0.05 + " reais");
				System.out.println(" Valor final do seu sal�rio ser� de : " + (salarioSemAjuste*0.05 + salarioSemAjuste) + " reais");	
			}
	}

}
