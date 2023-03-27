/*21 –Fazer um algoritmo que leia três notas e mostre: 
 * a média das notas,a situação final do aluno onde aprovado media = 7.
 */

import java.util.Scanner;
	
public class CalculeMedia {

	    public static void main(String[] args) {
	        // cria um objeto da classe Scanner para ler as notas do teclado
	        Scanner sc = new Scanner(System.in);
	        
	        // lê as notas do teclado
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = sc.nextDouble();
	        
	        System.out.print("Digite a segunda nota: ");
	        double nota2 = sc.nextDouble();
	        
	        System.out.print("Digite a terceira nota: ");
	        double nota3 = sc.nextDouble();
	        
	        // calcula a média das notas
	        double media = (nota1 + nota2 + nota3) / 3;
	        
	        // verifica a situação final do aluno
	        String situacao = "";
	        if (media >= 7) {
	            situacao = "Aprovado";  //Acima de 7 esta aprovado
	        } else {
	            situacao = "Reprovado"; //abaixo de 7 esta retido 
	        }
	        
	        // mostra os resultados na tela
	        System.out.println("A média das notas é " + media);
	        System.out.println("Situação final do aluno: " + situacao);
	    }

	}
