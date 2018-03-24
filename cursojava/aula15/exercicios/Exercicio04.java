package com.ariane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite uma letra: ");
		String infoLetra = scan.nextLine();
	
		switch (infoLetra) {
		
		case"A":
		case"E":
		case"I":
		case"O":
		case"U":
			System.out.println("A letra "+infoLetra+" é uma vogal");
			break;
	     default:
			System.out.println("A letra "+infoLetra+" é uma consoante");
		
		}
		}
		
		
	}


