package listaexercicio3;
/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner Leia= new Scanner (System.in);
		
		int numero, soma=0;
		
		System.out.println("Digite os numeros para a soma (Digite 0 quando quiser encerrar o programa): ");
		do  {
				numero=Leia.nextInt();
				soma=soma+numero;
			
			} while (numero!=0);
		
		System.out.println("A soma dos numeros digitados �: " +soma);
			
				
	}

}
