/*5-Faça um algoritmo que calcule a soma dos primeiros 50 números pares.
 * Este algoritmo não recebe valor do teclado. Os primeiros número pares são: 2, 4, 6, 8, 10, 12 ...
 * 
 * */


public class NumerosPares {

	    public static void main(String[] args) {
	        // inicializa a variável de soma
	        int soma = 0;
	        
	        // loop para somar os primeiros 50 números pares
	        for (int i = 2; i <= 100; i += 2) { //Ele incrementando de 2 em 2 até chegar ao número 100
	        	soma += i;                       
	        }
	        
	        // mostra o resultado da soma
	        System.out.println("A soma dos primeiros 50 números pares é: " + soma); //todos os números pares foram somados, o resultado é mostrado na tela
	    }

	}
