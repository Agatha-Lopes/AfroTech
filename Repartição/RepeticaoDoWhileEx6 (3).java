package ativdade_java;

import java.util.Scanner;

public class RepeticaoForEx1 {
	
	// 1- A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes, 
	//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber: a) média do salário da população; 
	// b) média do número de filhos; c) maior salário; d) percentual de pessoas com salário até R$100,00
  

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int habitantes, nFilhos, percentual = 0, porcentagem = 0;
		float salario, mediaFilhos, mediaSalario, maiorSalario = 0.0f, filhos = 0.0f, totalSalario = 0.0f;
		
		for(habitantes = 0; habitantes < 3; habitantes ++) {
			
			System.out.println("Digite seu sálario:");
			salario = leia.nextFloat();
			
			totalSalario += salario;
			
			System.out.println("Digite o número de Filhos:");
			nFilhos = leia.nextInt();
			
			filhos += nFilhos;
			
			if(salario>maiorSalario) {
			}
			
			if (salario >=100) {
				percentual +=1;
			}
		}
		
			mediaFilhos = filhos /3;
			mediaSalario = totalSalario /3;
			porcentagem = (percentual * 100) /3;
			
			System.out.println("\n Média de Filhos:" +mediaFilhos);
			System.out.println("\n Salário:" +mediaSalario);
			System.out.println("\n Percentual:" +porcentagem);
			leia.close();
	}


}
