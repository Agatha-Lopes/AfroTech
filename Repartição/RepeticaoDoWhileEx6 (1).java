package ativdade_java;

import java.util.Scanner;

public class ReparticaoDoWhileEx6 {
	
	//6- Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
	//Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int numero = 0, soma =0;
		
		System.out.println("Digite o número:");
		numero = leia.nextInt();
		
		do {
			soma += numero;
			numero -= 1;
		}
		while(numero >=0);
		System.out.println("Valor de soma: " + soma);
		
		leia.close();

	}

}
