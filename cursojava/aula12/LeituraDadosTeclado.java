package com.ariane.cursojava.aula12;

import java.util.Scanner;

//Devido ao uso da op��o Scanner foi acrescentado a  linha 3

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// Colocar como coment�rio paragr�fos inteiros: utiliza >> /* ... */
		
		// Lendo linhas inteiras
		
		/* System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo �: " + nomeCompleto);
        
        // Lendo dados espec�ficos
        
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome �: " + primeiroNome); 
        
        // Lendo um inteiro
        
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade �: " + idade); */
		
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem animais de estima��o: ");
        
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdeFilhos= scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println (" Voc�s digitou os seguintes valores:");
		System.out.println (" Primeiro Nome" + primeiroNome);
		System.out.println (" Idade" + idade);
		System.out.println (" Quantidade de filhos" + qtdeFilhos);
		System.out.println (" Altura" + altura);
		System.out.println (" Quantos animais possui" + temPet);
		
	}
	

}
