package listaexercicio3;

import java.util.Scanner;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Leia = new Scanner (System.in);
		int idade, maior50=0, menor21=0;
		
		System.out.print("Digite uma idade para começar o programa: ");
		idade=Leia.nextInt();
				
		while (idade!=-99) 
			{
			
				if (idade<21)
				{
					menor21++;
				}
				
				if(idade>50)
				{
					maior50++;
				}
				
				System.out.print("Digite a idade (Para sair digite -99): ");
				idade= Leia.nextInt();
				
			}
		
		System.out.println("\nPessoas com menos de 21: " +menor21);
		System.out.println("Pessoas com mais de 50: " + maior50);
				
				
	}

}
