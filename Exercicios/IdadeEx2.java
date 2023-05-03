package ativdade_java;

import java.util.Scanner;


//2-Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.


public class IdadeEx2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, dias, meses, anos; 
		
		System.out.println("Digite sua idade em dias :");
		idade = leia.nextInt();
		
		
		anos = idade /365;
		dias = idade % 30;
		meses = dias /30;
		dias = dias % 30;
		
		System.out.println("Agatha você tem:" +anos+ " anos " +meses+ " meses " +dias+ " dias de vidas ");
		
		leia.close();
	}

}
