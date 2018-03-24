package com.ariane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CalculoRendimentos {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou no mês? ");
		double horasTrabalhadas = scan.nextDouble();
		
		// cálculo salario bruto
		double salarioBruto = valorHora * horasTrabalhadas;
		System.out.println("Seu salário bruto foi de:  " + salarioBruto);
		
		// INSS
		
		double pagInss= salarioBruto * 0.008;
		System.out.println("O valor pago ao INSS foi de:  " + pagInss);
		
		// SINDICATO
		
		double pagSindicato= salarioBruto * 0.005;
		System.out.println("O valor pago ao sincato foi de:  " + pagSindicato);	
		
		// SALARIO LIQUIDO
		
		double salarioLiquido= salarioBruto - (salarioBruto*0.011) - pagSindicato - pagInss;
		System.out.println("Seu salário Líquido foi de :  " + salarioLiquido);	
		
		// TOTAL DE DESCONTOS
		
	}

}
