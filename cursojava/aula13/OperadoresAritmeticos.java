package com.ariane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado); 
		
		resultado = resultado - 1;
		System.out.println(resultado); 
		
		resultado = resultado * 2;
		System.out.println(resultado);
		

		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
   
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome= "Esta é ";
		String segundoNome= "uma String concatenada ";
		System.out.println( primeiroNome + segundoNome );
		
		resultado =  resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		// Quando utilizamos ++ após a variável significa o acréscimo de 1 unidade.
		
		System.out.println(resultado++);
		// Mesmo que 
		// System.out.println(resultado);
		// resultado =  resultado + 1;
		// resultado += 1;
		
		System.out.println(++resultado);
		// Mesmo que 
		// resultado += 1;
		// System.out.println(resultado);
		
		resultado --;
		System.out.println(resultado);
	
		System.out.println(resultado--);
		// primeiro vai imprimir o resultado e após retirar 1 unidade. Mas o valor que ficará
		// após a retirada dessa unidade, só aparecerá na próxima manipulação. Então no caso
		// apareceu 6 na tela, no entanto o cálculo será feito sendo 5.
		
		System.out.println(--resultado);
		// como nós tínhamos 5, retirando a unidade: o resultado deverá ser 4.
		
		
	}

}
