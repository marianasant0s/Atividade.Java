package listadeexercicio2;

import java.util.Scanner;

/*2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int n1, n2, n3, ordem=0;
		
		System.out.print("Escreva o 1� numero: ");
		n1= leia.nextInt();
		System.out.print("Escreva o 2� numero: ");
		n2 = leia.nextInt();
		System.out.print("Escreva o 3� numero: ");
		n3 = leia.nextInt();
		
		if (n1>n2)
		{ ordem=n1;
		  n1=n2;
		  n2= ordem;
		}
		
		if (n2>n3)
		{
			ordem=n2;
			n2=n3;
			n3= ordem;
		}
		
		if (n3>n1)
		{
			ordem=n3;
			n3=n1;
			n1= ordem;
		}
		
		System.out.print("\nA ordem crescente dos numeros � de: " + n3+ ", "+ n2 + ", "+ n1 + ".");
		
	}

}
