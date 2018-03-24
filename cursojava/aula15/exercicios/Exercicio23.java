package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		double calculoPreco;
		double calculoDesconto;

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual carne deseja comprar: file duplo, alcatra ou picanha? ");
		String tipoCarne = scan.nextLine();

		System.out.println("Quantos quilos? ");
		double kgCarne = scan.nextDouble();
		
		System.out.println("Irá utilizar o cartão da loja: sim ou não? ");
		String usoCartao = scan.nextLine();

		if ((tipoCarne.equals("file duplo")) && (kgCarne <= 5)) {
			calculoPreco = kgCarne * 4.90;
		} else {
			calculoPreco = kgCarne * 5.800;
		}

		if ((tipoCarne.equals("alcatra")) && (kgCarne <= 5)) {
			calculoPreco = kgCarne * 5.90;
		} else {
			calculoPreco = kgCarne * 6.80;
		}

		if ((tipoCarne.equals("picanha")) && (kgCarne <= 5)) {
			calculoPreco = kgCarne * 6.90;
		} else {
			calculoPreco = kgCarne * 7.80;
		}
		
		if (usoCartao.equals("sim")) {
			calculoDesconto = (calculoPreco - calculoPreco*0.05);
		} else {
			
		}
		

		System.out.println("O tipo de carne escolhida foi a: " + tipoCarne);
		System.out.println("O preço total da compra foi: " + calculoPreco);

	}

}
