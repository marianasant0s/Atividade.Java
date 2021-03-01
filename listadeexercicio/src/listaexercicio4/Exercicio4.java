package listaexercicio4;
/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args)
    {
	Scanner leia = new Scanner(System.in);
	
	 int mat[][] = new int [3][3], acimadedez=0,x;
	
	 System.out.println("Matriz [3][3]\n");
	 
	 	for (int linha = 0;linha<3;linha++)
	 		{
	 			for (int coluna1=0;coluna1<3;coluna1++)
	 			{
	 				System.out.println("Digite um numero: ");
	 				mat[linha][coluna1]=leia.nextInt();
	 				
	 				if (mat[linha][coluna1]>10)
	 				{	acimadedez++;
	 				
	 				}
	 				
	 			}
	 		}
		System.out.println("Numeros acima de 10: " + acimadedez );
	}

}
