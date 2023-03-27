/*21 �Fazer um algoritmo que leia tr�s notas e mostre: 
 * a m�dia das notas,a situa��o final do aluno onde aprovado media = 7.
 */

import java.util.Scanner;
	
public class CalculeMedia {

	    public static void main(String[] args) {
	        // cria um objeto da classe Scanner para ler as notas do teclado
	        Scanner sc = new Scanner(System.in);
	        
	        // l� as notas do teclado
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = sc.nextDouble();
	        
	        System.out.print("Digite a segunda nota: ");
	        double nota2 = sc.nextDouble();
	        
	        System.out.print("Digite a terceira nota: ");
	        double nota3 = sc.nextDouble();
	        
	        // calcula a m�dia das notas
	        double media = (nota1 + nota2 + nota3) / 3;
	        
	        // verifica a situa��o final do aluno
	        String situacao = "";
	        if (media >= 7) {
	            situacao = "Aprovado";  //Acima de 7 esta aprovado
	        } else {
	            situacao = "Reprovado"; //abaixo de 7 esta retido 
	        }
	        
	        // mostra os resultados na tela
	        System.out.println("A m�dia das notas � " + media);
	        System.out.println("Situa��o final do aluno: " + situacao);
	    }

	}
