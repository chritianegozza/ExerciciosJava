/*
 * Programa que gera um vetor de tamanho dado pelo usu�rio, 
   popula o vetor com valores aleat�rios e mostra o maior n�mero na tela:
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

			for (int i = 0; i < tamanho; i++) { //la�o for 
				vetor[i] = random.nextInt(100); // gera um n�mero aleat�rio entre 0 e 99
			}

			int maior = vetor[0];
			for (int i = 1; i < tamanho; i++) {
				if (vetor[i] > maior) {
					maior = vetor[i];
				}
			}

			System.out.printf("O maior n�mero do vetor � %d\n", maior);
		}
}
