package exercicios;

import java.util.Scanner;

public class Exc3_4DiagonalPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa que receba valores do usu�rio para preencher uma matriz 3X3, e
		 * em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
		 * ou seja, diagonal principal.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int linha=0,coluna=0,cont=1,somaMatriz=0,somaDiagonal=0;
		
		//Imprimir na tela
		System.out.println("\n****Digite 9 valores ****\n");
		
		//01-Capta��o de dados
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Digite o %d� valor: ",cont);
				matriz[linha][coluna] = ler.nextInt();
				cont++;
			}
		}//01-Fecha capta��o de dados
		
		//Imprimir divisor de tela
		System.out.println("***************************************");
		
		//02-Soma dos valores da matriz e a Soma da diagonal principal
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				somaMatriz += matriz[linha][coluna];
				
				//Soma da diagonal principal
				if(linha==coluna)
				{
					somaDiagonal += matriz[linha][coluna]; 
				}
				
				//Imprimir as linhas e colunas e os seus valores
				System.out.println("Linha "+linha+" e Coluna "+coluna+" da matriz = "+matriz[linha][coluna]);
			}
		}//02-Fecha a soma da matriz e diagonal principal
		
		//Imprimir divisor de tela
		System.out.println("***************************************");
		
		//Imprimir valores da matriz
		System.out.println("\nSoma dos valores da matriz = "+somaMatriz);
		
		//Imprimir diagonal principal
		System.out.println("Soma da diagonal principal = "+somaDiagonal);
	}
}
