package listaexercicio3;

/2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)/
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	int numero=0, impar=0, par=0,x;
	
		for (x=0;x<10;x++)
		{
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			if (numero%2==0)
			{
				par++;
			}
			
			else 
			{
				impar++;
			}
		 
		}
		
		System.out.println("A quantidade de numeros pares � de " +par+ " e a quantidade de impares �: " +impar);
	
	}
}