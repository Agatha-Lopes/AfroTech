package ativdade_java;

import java.util.Scanner;

public class RepeticaoWhileEx4 {
	
	//4- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
	//até que ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a 
	//seguinte sequência: 5 15 45 135.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o número :");
		numero = leia.nextInt();
		
		while(numero < 150){
		System.out.println("\nNúmero:" +numero);
		numero = numero * 3;
		
		leia.close();
	}

}
}
