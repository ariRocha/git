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
		
		String primeiroNome= "Esta � ";
		String segundoNome= "uma String concatenada ";
		System.out.println( primeiroNome + segundoNome );
		
		resultado =  resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		// Quando utilizamos ++ ap�s a vari�vel significa o acr�scimo de 1 unidade.
		
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
		// primeiro vai imprimir o resultado e ap�s retirar 1 unidade. Mas o valor que ficar�
		// ap�s a retirada dessa unidade, s� aparecer� na pr�xima manipula��o. Ent�o no caso
		// apareceu 6 na tela, no entanto o c�lculo ser� feito sendo 5.
		
		System.out.println(--resultado);
		// como n�s t�nhamos 5, retirando a unidade: o resultado dever� ser 4.
		
		
	}

}
