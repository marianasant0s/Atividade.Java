package listaexercicio4;
/* 2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num[]= new int [6];
        int numPar = 0, numImpar=0, somaPar=0, somaImpar = 0;
        
        for(int x = 0; x <6; x++){
            System.out.print("Digite um n�mero: ");
            num[x] = leia.nextInt();
            
            if(num[x] % 2 == 0)
            {
                numPar++;
                somaPar=somaPar+num[x];
            }
            
            if(num[x] % 2 == 1)
            {
                numImpar++;
                somaImpar=somaImpar+num[x];
            }

        }
        
      
        System.out.println("\nForam digitados " + numPar + " n�meros pares. ");
        System.out.println("\nForam digitados " + numImpar + " n�meros �mpares. ");
        System.out.println("\nA soma de numeros impares �: " +somaImpar+ " e a soma de numeros pares �: " +somaPar);        
    }


}
	