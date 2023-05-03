package ativdade_java;

import java.util.Scanner;

public class ArraysEx2 {

	//EXERCÍCIO 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor 
	//com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
	//contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		
		int dadoLancado = 3, maiorNumero = 0;
		double somaLancado = 0, media = 0;
		
		int [] dado = new int [dadoLancado];
		

        for (int i = 0; i < dadoLancado; ++i) {

            System.out.println("Qual o valor ?");
            dado[i] = input.nextInt();

            somaLancado += dado[i];

            if (maiorNumero < dado[i]) {
                maiorNumero = dado[i];

            }
        }

        media = somaLancado / dado.length;

        System.out.println("A média é: " + media);
        System.out.println("As maiores pontuações são:" +maiorNumero);

         
    }
	}


