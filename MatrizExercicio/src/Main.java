/*
 * Programa que gera uma matriz de tamanho dado pelo usu�rio,
 *  popula a matriz com valores aleat�rios e mostra o menor n�mero dessa matriz:
 */
 
import java.util.Random;
import java.util.Scanner;

	public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Digite o n�mero de linhas da matriz: ");
			int linhas = scanner.nextInt();

			System.out.print("Digite o n�mero de colunas da matriz: ");
			int colunas = scanner.nextInt();

			int[][] matriz = new int[linhas][colunas];
			Random random = new Random();

			for (int i = 0; i < linhas; i++) {
				for (int j = 0; j < colunas; j++) {
					matriz[i][j] = random.nextInt(100); // gera um n�mero aleat�rio entre 0 e 99
				}
			}

			int menor = matriz[0][0];
			for (int i = 0; i < linhas; i++) {
				for (int j = 0; j < colunas; j++) {
					if (matriz[i][j] < menor) {
						menor = matriz[i][j];
					}
				}
			}

  	 System.out.printf("O menor n�mero da matriz � %d\n", menor);
		}
}
