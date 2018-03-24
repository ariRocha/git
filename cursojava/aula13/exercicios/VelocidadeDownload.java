package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class VelocidadeDownload {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o tamanho do arquivo em MB: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe sua velocidade de download: ");
		double velocidadeDownload = scan.nextDouble();
		
		double tempoEstimado = tamanhoArquivo/velocidadeDownload;

		System.out.println("O tempo estimado de download é: " + tempoEstimado + " minutos");
		
	
	}

}
