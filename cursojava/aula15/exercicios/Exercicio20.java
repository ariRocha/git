package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// declara��o das vari�veis;

		int i;
		i = 0;

		System.out.println("Responda as seguintes perguntas sobre o Crime ");

		System.out.println("Voc� ligou para a v�tima? SIM OU N�O");
		String primeiraPergunta = scan.nextLine();
		if (primeiraPergunta.equals("SIM"))
			i = i + 1;
		System.out.println("Esteve no local do crime? SIM OU N�O");
		String segundaPergunta = scan.nextLine();
		if (segundaPergunta.equals("SIM"))
			i = i + 1;
		System.out.println("Mora perto da v�tima? SIM OU N�O");
		String terceiraPergunta = scan.nextLine();
		if (terceiraPergunta.equals("SIM"))
			i = i + 1;
		System.out.println("Devia para a v�tima? SIM OU N�O");
		String quartaPergunta = scan.nextLine();
		if (quartaPergunta.equals("SIM"))
			i = i + 1;
		System.out.println("J� trabalhou para a v�tima? SIM OU N�O");
		String quintaPergunta = scan.nextLine();
		if (quintaPergunta.equals("SIM"))
			i = i + 1;

		switch (i) {
		case 1:
			System.out.println("Inocente");
			break;
		// break> pausar�
		case 2:
			System.out.println("Suspeito");
			break;
		case 3:
			System.out.println("Suspeito");
			break;
		case 4:
			System.out.println("C�mplice");
			break;
		case 5:
			System.out.println("Culpado");
			break;
		default:
			System.out.println("Inocente");
			break;
		}
	}

}
