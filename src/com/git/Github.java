package com.git;

import java.util.Scanner;

public class Github {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		
		int num1;
		int num2;
		int soma;
		
		System.out.print("Digite o seu nome: ");
		nome = entrada.next();
		
		System.out.print("Digite um número: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite outro numero para somar: ");
		num2 = entrada.nextInt();
		
		soma = num1 + num2;
		
		System.out.println(nome+ ", O Resultado é: " +soma);
		
		
		
		
	}

}
