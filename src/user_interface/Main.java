package user_interface;

import java.text.DecimalFormat;
import java.util.Scanner;

import objs.IMC;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##.##");
		Scanner sc = new Scanner(System.in);
		IMC imc = new IMC();
		
		System.out.println("--------------------------\n"
						 + "    CALCULADORA DE IMC    \n"
						 + "--------------------------\n");
		
		System.out.println("Bem-vindo a Calculadora \nde IMC!\n");
		
		System.out.print("Por favor, informe sua \naltura (M): ");
		imc.altura = sc.nextDouble();
		System.out.println();
		
		System.out.print("Por favor, informe seu \npeso (Kg): ");
		imc.peso = sc.nextDouble();
		System.out.println();
		
		System.out.println("--------------------------\n"
				 		 + "       Calculando...      \n"
				 		 + "--------------------------\n");
		
		imc.calcular();
		
		System.out.println("Imc    : " + df.format(imc.valor));
		System.out.println("Status : " + imc.status);
		
		System.out.println();
		System.out.println("--------------------------");
	}

}
