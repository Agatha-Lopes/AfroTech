package ativdade_java;

import java.util.Scanner;

public class DecisaoIfElseEx1 {

	// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o número :");
		
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if((n1 > n2) && (n1 > n3)){
			maior = n1;
		}
		
		if((n2 > n1) && (n2 > n3)){
			maior = n2;
		}
		
		if((n3 > n1) && (n3 > n2)){
			maior = n3;
		}
		
		System.out.println("Informe o número maior: " +maior);
	}

}
