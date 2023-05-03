package ativdade_java;

import java.util.Scanner;

public class EventoFabricaEx1 {
	
	//1-Faça um sistema que leia o tempo de duração de um 
	//evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int horas, minutos, segundos;

		System.out.println("Digite o Tempo em segundos:");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = segundos % 3600 /60;
		segundos = segundos % 3600 %60;
		
		System.out.println("\nO tempo de duração do evento é: " +horas+ " horas " + minutos + " minutos " +segundos);
		
		leia.close();
		
	}

}
