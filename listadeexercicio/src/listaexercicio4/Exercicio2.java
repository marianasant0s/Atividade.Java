package listaexercicio4;
/* 2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num[]= new int [6];
        int numPar = 0, numImpar=0, somaPar=0, somaImpar = 0;
        
        for(int x = 0; x <6; x++){
            System.out.print("Digite um número: ");
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
        
      
        System.out.println("\nForam digitados " + numPar + " números pares. ");
        System.out.println("\nForam digitados " + numImpar + " números ímpares. ");
        System.out.println("\nA soma de numeros impares é: " +somaImpar+ " e a soma de numeros pares é: " +somaPar);        
    }


}
	