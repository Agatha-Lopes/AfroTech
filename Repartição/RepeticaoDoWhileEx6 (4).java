package ativdade_java;

public class RepeticaoForEx2 {
	
	// Desenvolver um sistema que efetue a soma de todos os números ímpares 
	//que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

	public static void main(String[] args) {
		
		int soma = 0, i;
		
		for(i = 0; i<=500; i += 1);
		
		if((i % 2)!= 0){
			if(( i % 3) == 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("Resultado da soma é :" +soma);

	}

}
