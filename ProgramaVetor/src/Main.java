/*
 * Programa que gera um vetor de tamanho dado pelo usuário, 
   popula o vetor com valores aleatórios e mostra o maior número na tela:
 */

import java.util.Random;//biblioteca para gerar numero aleatorios
import java.util.Scanner;// scanner a entrada do usuario 

	public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);// para pegar os dados digitados pelo usuarios 

			System.out.print("Digite o tamanho do vetor: ");
			int tamanho = scanner.nextInt();

			int[] vetor = new int[tamanho];//tamanho do vetor 
			Random random = new Random();

			for (int i = 0; i < tamanho; i++) { //laço for 
				vetor[i] = random.nextInt(100); // gera um número aleatório entre 0 e 99
			}

			int maior = vetor[0];
			for (int i = 1; i < tamanho; i++) {
				if (vetor[i] > maior) {
					maior = vetor[i];
				}
			}

			System.out.printf("O maior número do vetor é %d\n", maior);
		}
}
