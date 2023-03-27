/*5-Fa�a um algoritmo que calcule a soma dos primeiros 50 n�meros pares.
 * Este algoritmo n�o recebe valor do teclado. Os primeiros n�mero pares s�o: 2, 4, 6, 8, 10, 12 ...
 * 
 * */


public class NumerosPares {

	    public static void main(String[] args) {
	        // inicializa a vari�vel de soma
	        int soma = 0;
	        
	        // loop para somar os primeiros 50 n�meros pares
	        for (int i = 2; i <= 100; i += 2) { //Ele incrementando de 2 em 2 at� chegar ao n�mero 100
	        	soma += i;                       
	        }
	        
	        // mostra o resultado da soma
	        System.out.println("A soma dos primeiros 50 n�meros pares �: " + soma); //todos os n�meros pares foram somados, o resultado � mostrado na tela
	    }

	}
