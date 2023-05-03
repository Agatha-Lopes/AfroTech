package ativdade_java;

import java.util.Scanner;

public class MediaFinalEx3 {
	
	//3-Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,respectivamente.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

			int n1, n2, n3;
			float mediaFinal;
			
			System.out.println("Digite Nota1:");
			n1 = leia.nextInt();
			
			System.out.println("Digite Nota2:");
			n2 = leia.nextInt();
			
			System.out.println("Digite nota3:");
			n3 = leia.nextInt();
			
			mediaFinal = ((2 * n1) + (3 * n2) + (5 * n3)) /10;
			
			System.out.println("A Média Finaldo Aluno é : " + mediaFinal);
			
			leia.close();
		
	}

}
