package ativdade_java;

import java.util.Scanner;


public class RepeticaoWhileEx3 {
	
	//3- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
	//a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
	//valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int totalSomatoria = 0, valoresLidos= 0, qtdLidos = 0, media =0;
		
		while( valoresLidos > -1) {
	
		totalSomatoria =totalSomatoria + valoresLidos;
		qtdLidos = qtdLidos + 1;
		
		System.out.println("Digite o valor:");
			valoresLidos = leia.nextInt();
	}
		media = totalSomatoria/qtdLidos;
		
		System.out.println("\nTotal Somatoria: " + totalSomatoria);
		System.out.println("\n Valores Lidos :" + valoresLidos);
		System.out.println("\nMedia Total: " +media);
		
		leia.close();
}
}

