package listadeexercicio1;

import java.util.Scanner;

public class Exercicio2
{
	public static void main(String[]args)
	{
		Scanner leia = new Scanner(System.in);
		
		int idade, dia, mes, ano;
		
		System.out.print("Digite sua idade em dias: ");
		idade = leia.nextInt();
		dia = (idade% 365) % 30;
		mes = (idade % 365) / 30;
		ano = (idade / 365);
		
		System.out.printf("\nSua idade convertida em Anos �: %d",ano);
		
		System.out.printf("\nSua idade convertida em Meses �: %d",mes);
		
		System.out.printf("\nSua idade convertida em Dias �: %d",dia);
	}

}