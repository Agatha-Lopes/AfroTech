package ativdade_java;

import java.util.Scanner;
import java.lang.Math;


public class DistanciaEx4 {
	
	//4-Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2),
	//escreva a distância entre eles. A fórmula que efetua tal cálculo é:

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
		
		float x1, x2, y1, y2, d;
		
		System.out.println("Digite o valor de X1:");
		x1 = leia.nextFloat();
		
		System.out.println("Digite o valor de X2:");
		x2 = leia.nextFloat();
		
		System.out.println("Digite o valor de Y1:");
		y1 = leia.nextFloat();
		
		System.out.println("Digite o valor de Y2:");
		y2 = leia.nextFloat();
		
		d= (float) Math.sqrt((Math.pow((x2 -x1),2)+Math.pow((y2 -y1),2)));
		
		System.out.println("\n A Distância é:" +d);
		
		leia.close();
	}

}
