package ativdade_java;

import java.util.Scanner;

public class ArraysEx4 {
	
	//EXERCÍCIO 4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
	//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		
		   int matriz [][] = new int [3][3];
	        int somaMatriz=0, somaDiagonal=0, linha, coluna;


	        for(linha=0;linha<3;++linha){
	            for (coluna=0;coluna<3;++coluna) {

	                System.out.println("Qual o valor?");
	                matriz[linha][coluna] = input.nextInt();

	                somaMatriz += matriz[linha][coluna];

	                if (linha == coluna) {
	                    somaDiagonal += matriz[linha][coluna];
	                }
	            }

	        }
	        System.out.println("\nA soma dos valores da matriz é: "+somaMatriz);
	        System.out.println("\nA soma da Diagona é: "+somaDiagonal);

	    }


	}

