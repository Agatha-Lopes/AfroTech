package ativdade_java;

import java.util.Scanner;

public class DecisaoIfElseEx2 {
	
	//2- Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, ordem;
		
		System.out.println("Digite o primemiro número:");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if((n1 >= n2) && (n1 >= n3) && (n2 >= n3)) {
		 System.out.println("Ordem de cresecente é :" +n1 + n2+ n3);
		}
		
		if((n1 >= n2) && (n1 >= n3) && (n3 >=n2)) {
		System.out.println("Ordem de cresecente é :" + n1 +n3 + n2);
			
		}
			
		if((n2 >= n1) && (n2 >= n3) && (n1 >= n3)) { 
		System.out.println("Ordem de cresecente é :" + n2 +n1 + n3);
		}
		
		if((n2 >= n1) && (n2 >= n3) && (n3 >= n1)) {
		System.out.println("Ordem de cresecente é :" + n2 + n3 + n1);
		}
		
		if((n3 >= n1) && (n3 >= n2) && (n1 >= n2)) {
			System.out.println("Ordem de cresecente é :" + n3 + n1 + n2);
		}
		
		if((n3 >= n1) && (n3 >= n2) && (n2 >= n1)) {
			System.out.println("Ordem de cresecente é :" + n3 + n2 + n1);
			
			leia.close();
		}
	}
}
		
