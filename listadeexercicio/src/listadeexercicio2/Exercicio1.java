package listadeexercicio2;

import java.util.Scanner;

/* 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n, x=0, maiorNumero=0;
		
		for (x=0;x<3;x++)
		{
			System.out.print("Digite um numero: ");
			n = leia.nextInt();
			
			if (n>maiorNumero)
			{
				maiorNumero=n;
			}
		}
		
		System.out.print ("\nO maior numero �: "+ maiorNumero);
	}

}
